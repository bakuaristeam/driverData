package az.aris.DriverData.util;

import az.aris.DriverData.api.proxy.DriverLicenseServiceProxy;
import az.aris.DriverData.api.proxy.DriverServiceProxy;
import az.aris.DriverData.api.service.response.DriverDataResponse;
import az.aris.stmDriver.db.entities.Driver;
import az.aris.stm_driver_license.db.entity.DriverLicense;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HazelcastUtility {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    IMap<Long, Driver> mapOfDriver;
    @Autowired
    IMap<Long, DriverLicense> mapOfDriverLicense;

    @Autowired
    DriverServiceProxy driverServiceProxy;
    @Autowired
    DriverLicenseServiceProxy driverLicenseServiceProxy;

    //    public Driver getDriver(Long idDriver) throws Exception{
//        return mapOfDriver.get(idDriver);
//    }
    public DriverLicense getDriverLicense(Long idDriverLicense) throws Exception {
        return mapOfDriverLicense.get(idDriverLicense);
    }


    private Driver getDriver(Long idDriver) {
        try {
            logger.info("{} : {}", "Trying to get Driver from hazelcast for idDriver", idDriver);
            Driver driver = mapOfDriver.get(idDriver);
            if (driver != null) {
                logger.info("{} : {}", "Driver found from hazelcast", driver.toString());
                return driver;
            } else {
                logger.info("{} : {}", "Driver not found in hazelcast and trying to get from proxy idDriver", idDriver);
                ResponseEntity<Driver> responseDriver = driverServiceProxy.getIdDriver(idDriver);
                if (responseDriver.getStatusCodeValue() == 200) {
                    return responseDriver.getBody();
                } else {
                    return null;
                }
            }
        } catch (Exception e) {
            return null;
        }
    }

    private List<DriverLicense> getListOfDriverLicense(long idDriver) {
        try {
            logger.info("Trying to get license from hazelcast map for idDriver : " + idDriver);
            List<DriverLicense> list = new ArrayList<>();
            logger.info("map size of driver license : "+mapOfDriverLicense.size());
            if(mapOfDriverLicense==null|| mapOfDriverLicense.size()==0){
                ResponseEntity<DriverLicense> driverLicense = driverLicenseServiceProxy.getIdDriverLicense(idDriver);
//                proxyden goturmek lazimdi
            }
            for (Long idDriverLicense : mapOfDriverLicense.keySet()) {
                DriverLicense driverLicense = mapOfDriverLicense.get(idDriverLicense);
                logger.info("driver license : "+driverLicense.toString());
                if (driverLicense.getIdDriver() == idDriver) {
                    logger.info("adding driverLicense to list : "+driverLicense.getIdDriverLicense());
                    list.add(driverLicense);
                }
            }
            return list;
        } catch (Exception e) {
            logger.error("Error : {}, {}","getting driverLicense list",e,e);
        }
        return null;
    }


    public ResponseEntity<DriverDataResponse> getDriverDataResponse(long idDriver) {

        try {

            DriverDataResponse dataResponse = new DriverDataResponse();

            dataResponse.setListOfDriverLicense(getListOfDriverLicense(idDriver));
            dataResponse.setDriver(getDriver(idDriver));

            return new ResponseEntity<>(dataResponse, HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(null, null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}