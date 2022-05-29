package com.MMA.fighter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.MMA.fighter.entity")
@ComponentScan(basePackages = "com.MMA.fighter.controller")
@ComponentScan(basePackages = "com.MMA.fighter.repository")
@ComponentScan(basePackages = "com.MMA.fighter.service")
public class MmaFighterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmaFighterApplication.class, args);
	}

}
