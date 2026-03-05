package br.com.cpti.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cpti.aula.entity.Imovel;



public interface ImovelRepository extends JpaRepository<Imovel,Long> {
    
}
