package com.zll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;

@SpringBootApplication
public class Chapter1Application {

    // 编码（springboot默认utf8）
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return converter;
    }

	public static void main(String[] args) {
        SpringApplication.run(Chapter1Application.class, args);
	}
}
