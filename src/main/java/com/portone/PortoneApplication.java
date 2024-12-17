package com.portone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PortoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortoneApplication.class, args);
	}

}
