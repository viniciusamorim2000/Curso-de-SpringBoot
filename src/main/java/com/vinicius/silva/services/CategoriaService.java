package com.vinicius.silva.services;

import com.vinicius.silva.domain.Categoria;
import com.vinicius.silva.repositories.CategoriaRepository;
import com.vinicius.silva.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria find(Integer id) {
        Optional <Categoria> obj = repository.findById(id);
        if (obj==null){
            throw new ObjectNotFoundException("Objeto não encontrado ! Id: "+ id
            +", Tipo: "+ Categoria.class.getName());
        }
    return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: "+ "Tipo: "+ Categoria.class.getName()));
    }

}
