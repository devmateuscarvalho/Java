package br.com.mateus.POrientadaObjetos.Interfaces.Teste;

import br.com.mateus.POrientadaObjetos.Interfaces.Dominio.DatabaseLoader;
import br.com.mateus.POrientadaObjetos.Interfaces.Dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        databaseLoader.remove();
        fileLoader.load();
        fileLoader.remove();
        databaseLoader.checkPermission();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();


    }
}
