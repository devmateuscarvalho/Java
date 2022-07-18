package br.com.mateus.ClassesUtilitárias.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/mateus/dev";
        String arquivoTxt =  "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./mateus/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
