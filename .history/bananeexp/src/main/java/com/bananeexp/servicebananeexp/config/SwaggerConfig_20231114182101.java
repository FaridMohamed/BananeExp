package com.bananeexp.servicebananeexp.config;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  public static final String AUTHORIZATION_HEADER = "Authorization";

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(
            new ApiInfoBuilder()
                .description("Gestion de stock API documentation")
                .title("Gestion de stock REST API")
                .build()
        )
        .groupName("REST API V1")
        .securityContexts(Collections.singletonList(securityContext()))
        .securitySchemes(Collections.singletonList(apiKey()))
        .useDefaultResponseMessages(false)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.bouali.gestiondestock"))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiKey apiKey() {
    return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
  }

  private SecurityContext securityContext() {
    return SecurityContext.builder()
        .securityReferences(defaultAuth())
        .build();
  }

  List<SecurityReference> defaultAuth() {
    AuthorizationScope authorizationScope
        = new AuthorizationScope("global", "accessEverything");
    AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
    authorizationScopes[0] = authorizationScope;
    return Collections.singletonList(
        new SecurityReference("JWT", authorizationScopes));
  }

}
