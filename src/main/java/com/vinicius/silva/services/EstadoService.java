package com.vinicius.silva.services;

import com.vinicius.silva.domain.Categoria;
import com.vinicius.silva.domain.Estado;
import com.vinicius.silva.repositories.CategoriaRepository;
import com.vinicius.silva.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository repository;

    public Estado find(Integer id) {
        Optional <Estado> obj = repository.findById(id);
    return obj.orElse(null);
    }
}
