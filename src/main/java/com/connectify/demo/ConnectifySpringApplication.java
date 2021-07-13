package com.connectify.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;

@SpringBootApplication(exclude = {
        SecurityFilterAutoConfiguration.class
})

public class ConnectifySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConnectifySpringApplication.class, args);
    }

}
