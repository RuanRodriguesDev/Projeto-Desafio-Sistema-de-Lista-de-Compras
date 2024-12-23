package br.com.desafio.listacompras.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.listacompras.entity.Lista;
import br.com.desafio.listacompras.service.ListaService;

@RestController
@RequestMapping("/listas")
public class ListaController {
    private ListaService listaService;

    public ListaController(ListaService listaService) {
        this.listaService = listaService;
    }

    @PostMapping
    List<Lista>create(@RequestBody Lista lista){
        return listaService.create(lista);
    }

    @GetMapping
    List<Lista>busca(){
        return listaService.busca();
    }

    @PutMapping("{id}")
    List<Lista>update(@RequestBody Lista lista, @PathVariable("id") Long id){
        return listaService.update(id, lista);
    }

    @DeleteMapping("{id}")
    List<Lista>delete(@PathVariable("id") Long id){
        return listaService.delete(id);
    } 
}
