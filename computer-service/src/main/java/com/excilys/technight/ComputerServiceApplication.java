package com.excilys.technight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableAutoConfiguration
@SpringBootApplication
public class ComputerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputerServiceApplication.class, args);
	}
}
