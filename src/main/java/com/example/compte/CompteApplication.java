package com.example.compte;

import com.example.compte.DTO.RequestCompteDTO;
import com.example.compte.Entity.Compte;
import com.example.compte.Enums.TypeCompte;
import com.example.compte.Service.CompteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class CompteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompteApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteService compteService){
        return args -> {
          for (int i=0 ; i<3 ; i++){
              compteService.save(new RequestCompteDTO(Math.random()*1000,"DHS", TypeCompte.COURANT));
          }
            for (int i=0 ; i<3 ; i++){
                compteService.save(new RequestCompteDTO(Math.random()*1000,"DHS", TypeCompte.EPARGNE));
            }
        };
    }
}
