package com.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableDiscoveryClient;
import com.Service.UserDetailsAccountBalanceService;
import org.springframework.web.client.RestTemplate;
import com.DAO.UserDetailsAccountBalanceDAO;
import com.DAOImpl.UserDetailsAccountBalanceDAOImpl;


@SpringBootApplication
@EnableDiscoveryClient
public class UserDetailsAccountBalanceMicroservice {
	public static final String USER_DETAILS_URL = "http://user-detail-service";
	public static void main(String[] args) {
		SpringApplication.run(UserDetailsAccountBalanceMicroservice.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public UserDetailsAccountBalanceService userDetailsAccountBalanceService(){
		return new UserDetailsAccountBalanceDAOImpl(PROFILES_DETAILS_URL);
	}
}