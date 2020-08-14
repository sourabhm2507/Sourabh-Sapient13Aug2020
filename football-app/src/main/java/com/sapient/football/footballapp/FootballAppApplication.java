package com.sapient.football.footballapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class FootballAppApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FootballAppApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port","8081"));
		app.run(args);
		//SpringApplication.run(FootballAppApplication.class, args);
	}

}
