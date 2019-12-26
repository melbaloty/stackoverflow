package com.stackoverflow;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StackoverflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(StackoverflowApplication.class, args);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.stackoverflow")).build().apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {

		return new ApiInfo("StackOverflow API", "Sample API for stackoverflow web site", "1.0", "Free to use",
				new springfox.documentation.service.Contact("ezzat", "http://javabrains.io", "melbaloty@mum.edu"),
				"API License", "http://javabrains.io", Collections.emptyList());

	}

}
