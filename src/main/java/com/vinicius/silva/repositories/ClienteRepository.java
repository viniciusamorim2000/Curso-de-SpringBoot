package com.vinicius.silva.repositories;

import com.vinicius.silva.domain.Categoria;
import com.vinicius.silva.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}
