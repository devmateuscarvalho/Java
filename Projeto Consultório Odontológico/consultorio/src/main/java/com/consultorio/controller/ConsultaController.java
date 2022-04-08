package com.consultorio.controller;
import com.consultorio.Dto.ConsultaDto;
import com.consultorio.model.Consulta;
import com.consultorio.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    ConsultaService service;

    @GetMapping
    public ResponseEntity<List<Consulta>> findAll() {
       return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Consulta> findById(@RequestBody @PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Consulta> insert(@RequestBody ConsultaDto obj) {

        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(obj));

    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@RequestBody @PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Consulta> update(@RequestBody Consulta obj,@PathVariable Long id){
       obj = service.update(id, obj);
       return ResponseEntity.ok().body(obj);

    }


}
