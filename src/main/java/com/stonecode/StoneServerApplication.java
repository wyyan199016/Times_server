package com.stonecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StoneServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoneServerApplication.class, args);
	}
}
