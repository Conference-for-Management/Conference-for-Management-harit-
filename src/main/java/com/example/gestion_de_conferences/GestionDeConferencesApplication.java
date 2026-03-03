package com.example.gestion_de_conferences;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class GestionDeConferencesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDeConferencesApplication.class, args);
    }

}
