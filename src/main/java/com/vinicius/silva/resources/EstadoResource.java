package com.vinicius.silva.resources;

import com.vinicius.silva.domain.Categoria;
import com.vinicius.silva.domain.Estado;
import com.vinicius.silva.services.CategoriaService;
import com.vinicius.silva.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {

    @Autowired
    private EstadoService service;

    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
    public ResponseEntity<?> find (@PathVariable Integer id){
        Estado obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
}
