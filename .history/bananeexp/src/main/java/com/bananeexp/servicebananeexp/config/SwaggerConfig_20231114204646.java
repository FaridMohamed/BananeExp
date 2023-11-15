package com.bananeexp.servicebananeexp.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2

public class SwaggerConfig {

    public static final String AUTHORIZATION_HEADER = "Authorization";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(
                        new ApiInfoBuilder()
                                .description("Banane expo API documentation")
                                .title("Banane expo REST API")
                                .build())
                .groupName("REST API V")
                .securityContexts(Collections.singletonList(securityContext()))
                .securitySchemes(Collections.singletonList(apiKey()))
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bananeexp.servicebananeexp"))
                .paths(PathSelectors.any())
                .build();
    }

    /*
     * private ApiKey apiKey() {
     * return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
     * }
     * 
     * private SecurityContext securityContext() {
     * return SecurityContext.builder()
     * .securityReferences(defaultAuth())
     * .build();
     * }
     * 
     * List<SecurityReference> defaultAuth() {
     * AuthorizationScope authorizationScope = new AuthorizationScope("global",
     * "accessEverything");
     * AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
     * authorizationScopes[0] = authorizationScope;
     * return Collections.singletonList(
     * new SecurityReference("JWT", authorizationScopes));
     * }
     */

}