package com.hernandes.storeorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories
@EnableFeignClients("com.hernandes.storeorders")
public class StoreOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreOrdersApplication.class, args);
	}

}
