package com.felipe.Market_api;

import com.felipe.Market_api.domain.model.Category;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MarketApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketApiApplication.class, args);

	}


}
