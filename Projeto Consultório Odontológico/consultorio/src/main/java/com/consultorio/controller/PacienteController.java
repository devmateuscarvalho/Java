package com.consultorio.controller;


import com.consultorio.model.Consulta;
import com.consultorio.model.Paciente;
import com.consultorio.model.Paciente;
import com.consultorio.repository.PacienteRepository;
import com.consultorio.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/paciente")
public class PacienteController {
    @Autowired
    PacienteService service;

    @GetMapping
    public ResponseEntity<List<Paciente>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Paciente> findById(@RequestBody @PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Paciente> insert(@RequestBody Paciente obj) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(obj));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@RequestBody @PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Paciente> update(@RequestBody Paciente obj, @PathVariable Long id){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);

    }

}
