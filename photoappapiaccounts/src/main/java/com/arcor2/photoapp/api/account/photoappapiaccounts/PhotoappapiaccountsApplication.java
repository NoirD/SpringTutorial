package com.arcor2.photoapp.api.account.photoappapiaccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoappapiaccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoappapiaccountsApplication.class, args);
	}

}
