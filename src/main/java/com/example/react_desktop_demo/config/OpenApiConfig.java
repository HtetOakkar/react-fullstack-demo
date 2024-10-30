package com.example.react_desktop_demo.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info = @Info(
				title = "Movie Catalog",
				description = "Movie Catalog api documentation.",
				version = "1.0.1",
				summary = "Api documentation for Movie Catalog",
				contact = @Contact(
						name = "Htet Oakkar",
						email = "gemini.oakkar@gmail.com"
						)
				),
		servers = {
				@Server(
						description = "local server",
						url = "http://192.168.0.244:8181"
						)
		},
		security = {
				@SecurityRequirement(name = "BearerAuth")
		}
		)
@SecurityScheme(
		name = "BearerAuth",
		description = "Require JWT for authentication.",
		scheme = "Bearer",
		type = SecuritySchemeType.HTTP,
		bearerFormat = "JWT",
		in = SecuritySchemeIn.HEADER
		)
public class OpenApiConfig {

}
