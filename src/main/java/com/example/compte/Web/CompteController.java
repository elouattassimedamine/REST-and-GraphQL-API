package com.example.compte.Web;

import com.example.compte.DTO.RequestCompteDTO;
import com.example.compte.DTO.ResponseCompteDTO;
import com.example.compte.Entity.Compte;
import com.example.compte.Mappers.CompteMapper;
import com.example.compte.Service.CompteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compte")
public class CompteController {

    private CompteService compteService;
    private CompteMapper compteMapper;

    public CompteController(CompteService compteService, CompteMapper compteMapper) {
        this.compteService = compteService;
        this.compteMapper = compteMapper;
    }

    @PostMapping("/create")
    @ResponseBody
    public ResponseCompteDTO save(@RequestBody RequestCompteDTO compte){
        return compteService.save(compte);
    }


    @PutMapping("/update/{id}")
    @ResponseBody
    public ResponseCompteDTO update(@PathVariable String id, @RequestBody Compte compte){
        return compteService.update(id,compte);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        compteService.delete(id);
    }

    @GetMapping("/getcompte/{id}")
    @ResponseBody
    public ResponseCompteDTO getCompte(@PathVariable String id){
        return compteService.findById(id);
    }

    @GetMapping("/comptes")
    @ResponseBody
    public List<ResponseCompteDTO> comptes(){
        return compteService.findAll();
    }
}
