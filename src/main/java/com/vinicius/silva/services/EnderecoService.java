package com.vinicius.silva.services;

import com.vinicius.silva.domain.Cliente;
import com.vinicius.silva.domain.Endereco;
import com.vinicius.silva.repositories.ClienteRepository;
import com.vinicius.silva.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public Endereco find(Integer id) {
        Optional <Endereco> obj = repository.findById(id);
    return obj.orElse(null);
    }
}
