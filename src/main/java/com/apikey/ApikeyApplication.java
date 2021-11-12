package com.apikey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class ApikeyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApikeyApplication.class, args);
    }

}
