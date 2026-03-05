package br.com.cpti.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cpti.aula.entity.Proprietario;

public interface ProprietarioRepository extends JpaRepository<Proprietario,Long>{
    
}
