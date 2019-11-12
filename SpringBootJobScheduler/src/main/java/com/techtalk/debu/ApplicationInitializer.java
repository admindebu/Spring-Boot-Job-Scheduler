package com.techtalk.debu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ApplicationInitializer {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationInitializer.class, args);
	}

}

