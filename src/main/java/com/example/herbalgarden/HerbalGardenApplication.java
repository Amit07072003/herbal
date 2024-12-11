package com.example.herbalgarden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.example.herbalgarden")

public class HerbalGardenApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerbalGardenApplication.class, args);
	}

}
