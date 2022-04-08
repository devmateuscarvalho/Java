package com.consultorio.Dto;

import java.time.LocalDateTime;

public class ConsultaDto {
    private LocalDateTime horarioConsulta;
    private Long dentista_id;
    private Long paciente_id;

    public ConsultaDto(LocalDateTime horarioConsulta, Long dentista_id, Long paciente_id) {
        this.horarioConsulta = horarioConsulta;
        this.dentista_id = dentista_id;
        this.paciente_id = paciente_id;
    }

    public ConsultaDto() {
    }


    public LocalDateTime getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(LocalDateTime horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public Long getDentista_id() {
        return dentista_id;
    }

    public void setDentista_id(Long dentista_id) {
        this.dentista_id = dentista_id;
    }

    public Long getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Long paciente_id) {
        this.paciente_id = paciente_id;
    }

    @Override
    public String toString() {
        return "ConsultaDto{" +
                "horarioConsulta=" + horarioConsulta +
                ", dentista_id=" + dentista_id +
                ", paciente_id=" + paciente_id +
                '}';
    }


}
