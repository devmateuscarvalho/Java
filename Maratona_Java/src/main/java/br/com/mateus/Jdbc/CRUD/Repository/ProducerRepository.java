package br.com.mateus.Jdbc.CRUD.Repository;

import br.com.mateus.Jdbc.CRUD.Dominio.Producer;
import br.com.mateus.Jdbc.CRUD.connection.ConnectionFactory;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Log4j2

public class ProducerRepository {
    public static List<Producer> findByName(String name){
        log.info("Finding Producers by name: '{}'", name);
        String sql= "SELECT * FROM anime_store.producer where name like '%s';"
                .formatted("%"+name+"%");
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        }catch(SQLException e)
        {
            log.error("Error while trying to find producers byName", e);
        }
        return producers;
    }
}
