package com.example.compte.DTO;

import com.example.compte.Enums.TypeCompte;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ResponseCompteDTO {

    private String id;
    private Date creation_compte;
    private Double solde_compte;
    private String devise_compte;
    private TypeCompte typeCompte;
}
