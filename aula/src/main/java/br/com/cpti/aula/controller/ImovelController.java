package br.com.cpti.aula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cpti.aula.entity.Imovel;
import br.com.cpti.aula.repository.ImovelRepository;


@RestController
@RequestMapping("/imoveis")
public class ImovelController {
    @Autowired
    private ImovelRepository repository;

    @PostMapping
    public Imovel inserir(@RequestBody Imovel i){
        return repository.save(i);
    }
}
