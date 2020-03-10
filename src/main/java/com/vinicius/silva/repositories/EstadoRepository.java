package com.vinicius.silva.repositories;

import com.vinicius.silva.domain.Categoria;
import com.vinicius.silva.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {


}
