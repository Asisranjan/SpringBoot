package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com.example.demo.repo")
@EntityScan("com.example.demo.model")
@SpringBootApplication
public class SpringBootstrapBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootstrapBasicsApplication.class, args);
	}

}
