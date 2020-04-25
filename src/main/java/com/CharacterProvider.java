package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "character*")
public class CharacterProvider {
	public static void main(final String[] args) {
		SpringApplication.run(CharacterProvider.class, args);
	}

}