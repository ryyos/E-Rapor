package com.erapor.erapor;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Electronic Report Card", description = "Just Playground", version = "v1", license = @License(name = " MIT license")))
public class ERaporApplication {
	public static void main(String[] args) {
		SpringApplication.run(ERaporApplication.class, args);
	}

}
