package com.consultorio.service;

import com.consultorio.model.Dentista;
import com.consultorio.repository.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistaService {
    @Autowired
    DentistaRepository dentistaRepository;

    public List<Dentista> findAll(){
        return dentistaRepository.findAll();
    }
    public Dentista findById(Long id){
        return dentistaRepository.findById(id).get();
    }
    public Dentista insert(Dentista obj){
        return dentistaRepository.save(obj);
    }
    public void delete(Long id){
        dentistaRepository.deleteById(id);
    }
    public Dentista update(Long id, Dentista obj){
        
        Dentista atual = findById(id);
        atual.setNome(obj.getNome());
        atual.setEspecializacao(obj.getEspecializacao());

        return dentistaRepository.save(atual);
    }

}
