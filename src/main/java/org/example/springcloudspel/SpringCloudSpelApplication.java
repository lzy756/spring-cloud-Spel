package org.example.springcloudspel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@SpringBootApplication
public class SpringCloudSpelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSpelApplication.class, args);
    }
    @Bean
    public Function<String,String> reverseString() {
        return value -> new StringBuilder(value).reverse().toString();
    }
    @Bean
    public Function<String, List> word() {
        return ss -> Arrays.asList(ss.split(","));
    }
}
