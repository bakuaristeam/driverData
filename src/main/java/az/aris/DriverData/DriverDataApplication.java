package az.aris.DriverData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 *
 * Driver Data 2 projeni birləşdiri
 * Driver və Driver License
 *
 *
 *
 */
@SpringBootApplication
@EnableFeignClients("az.aris.DriverData")
@EnableDiscoveryClient
public class DriverDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriverDataApplication.class, args);
	}

}
