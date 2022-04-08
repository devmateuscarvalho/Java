package com.consultorio.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Consulta{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime horarioConsulta;
    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;
    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dentista_id")
    private Dentista dentista;

    public Consulta(LocalDateTime horarioConsulta, Paciente paciente, Dentista dentista) {
        this.horarioConsulta = horarioConsulta;
        this.paciente = paciente;
        this.dentista = dentista;
    }

    public Consulta() {

    }

    public Long getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(LocalDateTime horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    @PrePersist
    public void persistCreateAt(){
        this.createdAt = LocalDateTime.now();
    }



    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", horarioConsulta=" + horarioConsulta +
                ", paciente=" + paciente +
                ", dentista=" + dentista +
                '}';
    }

}
