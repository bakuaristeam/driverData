package az.aris.DriverData.api.service.response;

import az.aris.stmDriver.db.entities.Driver;
import az.aris.stm_driver_license.db.entity.DriverLicense;

import java.util.List;

public class DriverDataResponse {
    private Driver Driver;
    private List<DriverLicense> listOfDriverLicense;

    public DriverDataResponse(az.aris.stmDriver.db.entities.Driver driver, List<DriverLicense> listOfDriverLicense) {
        Driver = driver;
        this.listOfDriverLicense = listOfDriverLicense;
    }

    public DriverDataResponse() {
    }

    public az.aris.stmDriver.db.entities.Driver getDriver() {
        return Driver;
    }

    public void setDriver(az.aris.stmDriver.db.entities.Driver driver) {
        Driver = driver;
    }

    public List<DriverLicense> getListOfDriverLicense() {
        return listOfDriverLicense;
    }

    public void setListOfDriverLicense(List<DriverLicense> listOfDriverLicense) {
        this.listOfDriverLicense = listOfDriverLicense;
    }
}
