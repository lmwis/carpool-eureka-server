package com.fehead.carpooleurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CarpoolEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarpoolEurekaServerApplication.class, args);
	}

}
