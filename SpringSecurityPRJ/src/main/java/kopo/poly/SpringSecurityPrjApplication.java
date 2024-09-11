package kopo.poly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories

public class SpringSecurityPrjApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityPrjApplication.class, args);
    }

}
