package com.dev.CareProductsAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.dev.CareProductsAPI.service")
public class CareProductsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CareProductsApiApplication.class, args);
	}

}
