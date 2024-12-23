package br.com.desafio.listacompras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio.listacompras.entity.Lista;

public interface ListaRepository extends JpaRepository<Lista, Long> {
    
}
