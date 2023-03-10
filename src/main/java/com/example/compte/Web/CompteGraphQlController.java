package com.example.compte.Web;

import com.example.compte.DTO.RequestCompteDTO;
import com.example.compte.DTO.ResponseCompteDTO;
import com.example.compte.Entity.Compte;
import com.example.compte.Enums.TypeCompte;
import com.example.compte.Repository.CompteRepository;
import com.example.compte.Service.CompteService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CompteGraphQlController {
    private CompteService compteService;
    private CompteRepository compteRepository;

    public CompteGraphQlController(CompteService compteService, CompteRepository compteRepository) {
        this.compteService = compteService;
        this.compteRepository = compteRepository;
    }

    @QueryMapping
    public List<Compte> compteList(){
        return compteRepository.findAll();
    }
    @QueryMapping
    public Compte compteById(@Argument String id){
        return compteRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account %s n'existe pas",id)));
    }

    @MutationMapping
    public ResponseCompteDTO createCompte(@Argument RequestCompteDTO compte){
        return compteService.save(compte);
    }

    @QueryMapping
    public Boolean deleteCompte(@Argument String id){
         compteRepository.deleteById(id);
         return true;
    }
}


