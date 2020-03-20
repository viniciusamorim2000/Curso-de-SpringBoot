package com.vinicius.silva.services;


import com.vinicius.silva.domain.Cliente;
import com.vinicius.silva.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente find(Integer id) {
        Optional <Cliente> obj = repository.findById(id);
    return obj.orElse(null);
    }
}
