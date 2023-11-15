package com.bananeexp.bananeexp;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.bananeexp.bananeexp

@SpringBootApplication
public class BananeexpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BananeexpApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ClientRepository clientRepository) {
		return args->{
			Stream.of("A","B","C").forEach(cl ->{clientRepository.save
				(new Client(null,cl,"test","tettetetet","testrr","yyyyyy","igifigig"))});
		}

	}

}