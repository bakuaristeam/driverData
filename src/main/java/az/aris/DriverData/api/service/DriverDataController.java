package az.aris.DriverData.api.service;

import az.aris.DriverData.api.service.response.DriverDataResponse;
import az.aris.DriverData.util.HazelcastUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverDataController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

@Autowired
    HazelcastUtility hazelcastUtility;

    @GetMapping("/getDriverData/{idDriver}")
    public ResponseEntity<DriverDataResponse> getDriver(@PathVariable("idDriver") long idDriver) throws Exception {
        return hazelcastUtility.getDriverDataResponse(idDriver);

}}