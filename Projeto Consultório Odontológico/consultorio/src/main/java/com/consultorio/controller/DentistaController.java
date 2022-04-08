package com.consultorio.controller;
import com.consultorio.model.Consulta;
import com.consultorio.model.Dentista;
import com.consultorio.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/dentista")
public class DentistaController {

    @Autowired
    DentistaService service;

    @GetMapping
    public ResponseEntity<List<Dentista>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Dentista> findById(@RequestBody @PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Dentista> insert(@RequestBody Dentista obj) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(obj));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@RequestBody @PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Dentista> update(@RequestBody Dentista obj, @PathVariable Long id){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);

    }



}
