package com.arcor2.photoapp.api.gateway.photoappzuulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class PhotoappzuulapigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoappzuulapigatewayApplication.class, args);
	}

}
