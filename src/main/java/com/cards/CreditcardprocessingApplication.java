package com.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.cards.service.CreditCardService;
import com.cards.service.CreditCardServiceImpl;

@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "app")
@SpringBootApplication
public class CreditcardprocessingApplication {

	@Bean
	CreditCardService getCreditCardService() {
		return new CreditCardServiceImpl();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CreditcardprocessingApplication.class, args);
	}

}
