package com.consultorio.service;

import com.consultorio.Dto.ConsultaDto;
import com.consultorio.model.Consulta;
import com.consultorio.repository.ConsultaRepository;
import com.consultorio.repository.DentistaRepository;
import com.consultorio.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {
    @Autowired
    ConsultaRepository consultaRepository;
    @Autowired
    PacienteRepository pacienteRepository;
    @Autowired
    DentistaRepository dentistaRepository;

    public List<Consulta> findAll(){
        return consultaRepository.findAll();
    }
    public Consulta findById(Long id){
        return consultaRepository.findById(id).get();
    }
    public Consulta insert(ConsultaDto obj){
        Consulta novaConsulta = new Consulta();
        novaConsulta.setHorarioConsulta(obj.getHorarioConsulta());
        novaConsulta.setDentista(dentistaRepository.findById(obj.getDentista_id()).get());
        novaConsulta.setPaciente(pacienteRepository.findById(obj.getPaciente_id()).get());
        return consultaRepository.save(novaConsulta);
    }
    public void delete(Long id){
        consultaRepository.deleteById(id);
    }
    public Consulta update( Long id, Consulta obj){

        Consulta atual = findById(id);
        atual.setDentista(obj.getDentista());
        atual.setPaciente(obj.getPaciente());
        atual.setHorarioConsulta(obj.getHorarioConsulta());
        return consultaRepository.save(atual);
    }

}
