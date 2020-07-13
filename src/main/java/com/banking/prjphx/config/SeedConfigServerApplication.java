package com.banking.prjphx.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SeedConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeedConfigServerApplication.class, args);
	}

}
