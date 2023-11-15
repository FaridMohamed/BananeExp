package com.bananeexp.servicebananeexp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaAuditing
@EnableWebMvc
public class BananeexpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BananeexpApplication.class, args);
	}

	/*
	 * @Bean
	 * CommandLineRunner start(ClientRepository clientRepository) {
	 * return args -> {
	 * Stream.of("A", "B", "C").forEach(cl -> {
	 * 
	 * clientRepository.save(new Client(null, cl, "test", "tettetetet", "testrr",
	 * "yyyyyy", "igifigig"));
	 * });
	 * clientRepository.findAll().forEach(System.out::println);
	 * };
	 * 
	 * }
	 */

}
