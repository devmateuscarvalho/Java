package com.consultorio.service;

import com.consultorio.model.Paciente;
import com.consultorio.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }
    public Paciente findById(Long id){
        return pacienteRepository.findById(id).get();
    }
    public Paciente insert(Paciente obj){
        return pacienteRepository.save(obj);
    }
    public void delete(Long id){
        pacienteRepository.deleteById(id);
    }
    public Paciente update(Long id, Paciente obj){
        Paciente atual = findById(id);
        atual.setNome(obj.getNome());
        atual.setTelefone(obj.getTelefone());
        return pacienteRepository.save(atual);
    }

}
