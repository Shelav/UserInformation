package com.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserDetailsMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(UserDetailsMicroservice.class, args);
	}
}