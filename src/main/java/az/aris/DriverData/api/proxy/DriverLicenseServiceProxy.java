package az.aris.DriverData.api.proxy;

import az.aris.stm_driver_license.db.entity.DriverLicense;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "stm_driver_license")
public interface DriverLicenseServiceProxy {
    @GetMapping("/stm_driver_license/search/getDriverLicense/{idDriverLicense}")
    ResponseEntity<DriverLicense> getIdDriverLicense(@PathVariable("idDriverLicense")long idDriverLicense);
}
