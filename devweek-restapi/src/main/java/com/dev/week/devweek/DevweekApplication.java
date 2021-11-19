package com.dev.week.devweek;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;

@SpringBootApplication
public class DevweekApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevweekApplication.class, args);
	}

	/**
	 * This bean is added so GraphQL knows
	 * how to deal with lazy loadings during
	 * execution (character's collections)
	 * 
	*/
	@Bean
	public Filter OpenFilter() {
		return new OpenEntityManagerInViewFilter();
	}
}
