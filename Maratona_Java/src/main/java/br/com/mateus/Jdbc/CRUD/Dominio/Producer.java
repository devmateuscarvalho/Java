package br.com.mateus.Jdbc.CRUD.Dominio;


import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
    Integer id;
    String name;
}
