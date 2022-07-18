package br.com.mateus.Jdbc.service;

import br.com.mateus.Jdbc.dominio.Producer;
import br.com.mateus.Jdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {


    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }
    public static void delete(int id){
        requireValidId(id);
        ProducerRepository.delete(id);
    }
    public static void update(Producer producer){
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }
    public static List<Producer> findAll(){
    return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name){
    return ProducerRepository.findByName(name);
    }

    public static void showProducerMetaData(){
    ProducerRepository.showProducerMetadata();
    }
    public static void showDriverMetaData(){
    ProducerRepository.showDriverMetadata();
    }
    public static void showTypeScrollWorking(){
    ProducerRepository.showTypeScrollWorking();
    }

// Possivel exception
    private static void requireValidId(Integer id){
        if (id == null || id <= 0){
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
