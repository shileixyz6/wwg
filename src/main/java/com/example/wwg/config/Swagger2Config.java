package com.example.wwg.config;/**
 * @Author : xiao
 * @Date : 2020/7/17 15:37
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
 * @program: wwg1
 * @description: Api
 * @author: Mr.Xiao
 * @create: 2020-07-17 15:37
 **/
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket creatRestApi(){
       return new Docket(DocumentationType.SWAGGER_2)
               .apiInfo(apiInfo())
               .select()
               .apis(RequestHandlerSelectors.basePackage("com.example.wwg.controller"))
               //为有@Api注解的Controller生成API文档
               .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
               //为有@ApiOperation注解的方法生成API文档
               .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
               .paths(PathSelectors.any())
               .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("SwaggerUI演示")
                .description("wwg")
                .contact("macro")
                .version("1.0")
                .build();
    }
}
