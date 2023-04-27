package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringBootMsProj02ShoppinServiceConsumerMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj02ShoppinServiceConsumerMs1Application.class, args);
	}

}
