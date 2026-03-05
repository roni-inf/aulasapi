package br.com.cpti.aula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cpti.aula.entity.Proprietario;
import br.com.cpti.aula.repository.ProprietarioRepository;



@RestController
@RequestMapping("/proprietarios")
public class ProprietarioController {
    @Autowired
    private ProprietarioRepository repository;
    
    @PostMapping
    public Proprietario inserir(@RequestBody Proprietario p){
        return repository.save(p);
    }
    
}
