package com.openparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.openparty"})
public class OpenPartyApp {

    public static void main(String[] args) {
        SpringApplication.run(OpenPartyApp.class, args);
    }
}