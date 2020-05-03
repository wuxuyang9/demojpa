package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan("com.example")
@EntityScan("com.example")
@EnableJpaRepositories("com.example")
@EnableJpaAuditing
@EnableSolrRepositories("com.example.demo.repository")
@EnableWebMvc
public class DemojpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemojpaApplication.class, args);
	}




}
