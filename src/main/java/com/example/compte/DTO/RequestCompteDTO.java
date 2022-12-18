package com.example.compte.DTO;

import com.example.compte.Enums.TypeCompte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Data @NoArgsConstructor @AllArgsConstructor
public class RequestCompteDTO {

    private Double solde_compte;
    private String devise_compte;
    private TypeCompte typeCompte;
}
