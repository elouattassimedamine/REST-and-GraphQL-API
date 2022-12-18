package com.example.compte.Mappers;

import com.example.compte.DTO.RequestCompteDTO;
import com.example.compte.DTO.ResponseCompteDTO;
import com.example.compte.Entity.Compte;

public interface CompteMapper{

    Compte deRequestCompteACompte(RequestCompteDTO requestCompteDTO);
    ResponseCompteDTO deCompteAResponseCompte(Compte compte);
}
