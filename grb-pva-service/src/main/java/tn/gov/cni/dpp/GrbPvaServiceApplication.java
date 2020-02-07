package tn.gov.cni.dpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GrbPvaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrbPvaServiceApplication.class, args);
	}

}
