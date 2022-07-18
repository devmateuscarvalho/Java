package br.com.mateus.Jdbc.test;

import br.com.mateus.Jdbc.dominio.Producer;
import br.com.mateus.Jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer
                .builder()
                .name("Nao sei porque vc se foi")
                .build();
        Producer producerToUpdate = Producer
                .builder()
                .id(8)
                .name("MADHOUSE")
                .build();

      // ProducerService.save(producer);
       // ProducerService.delete(0);
        //ProducerService.update(producerToUpdate);

       // List<Producer> producers = ProducerService.findAll();
        // log.info("Producers found '{}'", producers);

       // List<Producer> producers = ProducerService.findByName("Mad");
       // log.info("Producers found '{}'", producers);

        //ProducerService.showProducerMetaData();


       // ProducerService.showDriverMetaData();

        ProducerService.showTypeScrollWorking();
    }
}
