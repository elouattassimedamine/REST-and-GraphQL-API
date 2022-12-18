package com.example.compte.Service;

import com.example.compte.DTO.RequestCompteDTO;
import com.example.compte.DTO.ResponseCompteDTO;
import com.example.compte.Entity.Compte;

import java.util.List;

public interface CompteService{

    ResponseCompteDTO save(RequestCompteDTO requestCompteDTO);
    ResponseCompteDTO update(String id, Compte compte);
    void delete(String id);
    ResponseCompteDTO findById(String id);
    List<ResponseCompteDTO> findAll();
}
