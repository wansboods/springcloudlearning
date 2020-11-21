package com.wansboods.nacosapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosApiGatewayApplication.class, args);
	}

}
