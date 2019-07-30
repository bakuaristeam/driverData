package az.aris.DriverData.util;

import az.aris.stmDriver.db.entities.Driver;
import az.aris.stm_driver_license.db.entity.DriverLicense;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfiguration {
    @Bean
    public Config config(){
        return new Config();
    }

    @Bean
    public HazelcastInstance instance(Config config){
        return Hazelcast.newHazelcastInstance(config);
    }
    @Bean
    public IMap<Long, DriverLicense> mapOfDriverLicence(HazelcastInstance instance){
        return instance.getMap("mapOfDriverLicense");
    }

    @Bean
    public IMap<Long, Driver> mapOfIdDriver(HazelcastInstance instance) {
        return instance.getMap("mapOfDriver");
    }
}
