package br.com.desafio.listacompras.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.desafio.listacompras.entity.Lista;
import br.com.desafio.listacompras.repository.ListaRepository;

@Service
public class ListaService {
    private ListaRepository listaRepository;
    

    public ListaService(ListaRepository listaRepository) {
        this.listaRepository = listaRepository;
    }

    public List<Lista>create(Lista lista){
        listaRepository.save(lista);
        return busca();
    }

    public List<Lista>busca(){
        return listaRepository.findAll();
    }
    
    public List<Lista>update(Long id,Lista lista){
        listaRepository.save(lista);
        return busca();
    }
    
    public List<Lista>delete(Long id){
        listaRepository.deleteById(id);
        return busca();
    }
    
}
