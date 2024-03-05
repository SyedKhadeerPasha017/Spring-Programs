package com.kp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CustomerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServerApplication.class, args);
	}

}
