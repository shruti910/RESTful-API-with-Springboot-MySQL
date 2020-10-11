package com.demo.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.demo.project")
@SpringBootApplication
public class SpringbootMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMysqlApplication.class, args);
	}

}
