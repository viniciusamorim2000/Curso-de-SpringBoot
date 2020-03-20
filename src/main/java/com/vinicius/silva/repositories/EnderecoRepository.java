package com.vinicius.silva.repositories;

import com.vinicius.silva.domain.Cliente;
import com.vinicius.silva.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {


}
