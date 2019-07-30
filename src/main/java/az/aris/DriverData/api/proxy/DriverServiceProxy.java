package az.aris.DriverData.api.proxy;

import az.aris.stmDriver.db.entities.Driver;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "stm-driver")
public interface DriverServiceProxy {
    @GetMapping("/stm-driver/search/getDriver/{idDriver}")
    ResponseEntity<Driver> getIdDriver(@PathVariable("idDriver")long idDriver );
}
