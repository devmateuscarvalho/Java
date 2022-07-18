package br.com.mateus.ClassesUtilitárias.IO.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fw)) {
            br.write("Continuo escrevendo coisas para o arquivo");
            br.newLine();
            br.write("Continuo escrevendo coisas para o arquivo");
            br.flush();

            } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

