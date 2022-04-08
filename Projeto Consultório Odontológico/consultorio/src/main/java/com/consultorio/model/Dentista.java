package com.consultorio.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Dentista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String especializacao;
    @OneToOne(cascade = CascadeType.ALL)
    private Consulta consulta;

    public Dentista(String nome, String especializacao) {
        this.nome = nome;
        this.especializacao = especializacao;

    }
    public Dentista() {

    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especializacao='" + especializacao + '\'' +
                '}';
    }
}
