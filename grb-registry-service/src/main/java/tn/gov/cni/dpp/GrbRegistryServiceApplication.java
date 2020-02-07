package tn.gov.cni.dpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GrbRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrbRegistryServiceApplication.class, args);
	}

}
