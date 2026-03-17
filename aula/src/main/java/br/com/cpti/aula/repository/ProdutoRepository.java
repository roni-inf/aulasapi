package br.com.cpti.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cpti.aula.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
