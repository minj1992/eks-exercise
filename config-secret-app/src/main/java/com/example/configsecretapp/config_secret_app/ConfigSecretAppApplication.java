package com.example.configsecretapp.config_secret_app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigSecretAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSecretAppApplication.class, args);
    }

    @RestController
    public class InfoController {

        @Value("${USERNAME}")
        private String username;

        @Value("${PASSWORD}")
        private String password;

        @Value("${TOKEN}")
        private String token;

        @Value("${SERVER}")
        private String server;

        @GetMapping("/info")
        public String getInfo() {
            return "Username: " + username + ", Password: " + password + ", Token: " + token + ", Server: " + server;
        }
    }
}
