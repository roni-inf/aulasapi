package br.com.cpti.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cpti.banco.entity.Produto;


public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    
}
