package com.vinicius.silva.services;

import com.vinicius.silva.domain.Cidade;
import com.vinicius.silva.domain.Estado;
import com.vinicius.silva.repositories.CidadeRepository;
import com.vinicius.silva.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository repository;

    public Cidade find(Integer id) {
        Optional <Cidade> obj = repository.findById(id);
    return obj.orElse(null);
    }
}
