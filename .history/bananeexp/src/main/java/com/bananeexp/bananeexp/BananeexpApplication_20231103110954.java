package com.bananeexp.bananeexp;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BananeexpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BananeexpApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ClientRepo clientRepository) {
		return args->{
			Stream.of("A","B","C").forEach(cl ->{clientRepository.sa});
		}

	}

}
