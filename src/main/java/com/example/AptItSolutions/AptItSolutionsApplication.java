package com.example.AptItSolutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AptItSolutionsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AptItSolutionsApplication.class, args);
        System.out.println("HELLO APT IT SOLUTIONS");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AptItSolutionsApplication.class);
    }
}

		
		
		
		
	
