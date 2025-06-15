package com.kanechan.apindra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
	    info = @Info(title = "API Indra Teste", version = "1.0", description = "Documentação da API do roteiro da Indra"),
	    servers = @Server(url = "/", description = "Servidor Local")
	)
@SpringBootApplication
public class ApindraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApindraApplication.class, args);
	}

}
