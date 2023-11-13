package com.nopaldevelop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(scanBasePackages = {com.nopaldevelop.persistence.mapper.CategoryMapper})
public class NopaldevelopApplication {

	public static void main(String[] args) {
		SpringApplication.run(NopaldevelopApplication.class, args);
	}

}
