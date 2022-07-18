package br.com.mateus.ClassesUtilitárias.IO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file)) {
            fw.write("Escrevendo alguma coisa no arquivo");
            fw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
