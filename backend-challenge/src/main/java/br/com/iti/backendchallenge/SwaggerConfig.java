/**
 * 
 */
package br.com.iti.backendchallenge;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author tiago
 * @date 2021-02-12
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("br.com.iti.backendchallenge.controller")).paths(PathSelectors.any())
				.build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Spring Boot REST API")
				.description("Spring Boot REST API for Validation password. \n\n" +
						"Example: \n" +
						"password = (\"\") 			-> false \n" + 
						"password = (\"aa\") 		-> false \n" + 
						"password = (\"ab\") 		-> false \n" + 
						"password = (\"AAAbbbCc\") 	-> false \n" + 
						"password = (\"AbTp9!foo\") -> false \n" + 
						"password = (\"AbTp9!foA\") -> false	\n" + 
						"password = (\"AbTp9 fok\") -> false	\n" + 
						"password = (\"AbTp9!fok\") -> true").version("1.0").build();
	}

}