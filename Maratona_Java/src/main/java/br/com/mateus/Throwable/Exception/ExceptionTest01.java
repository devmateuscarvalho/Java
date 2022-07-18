package br.com.mateus.Throwable.Exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
              criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("Arquivo\\teste4.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: "+isCriado);
        }
        catch(IOException e){
            e.printStackTrace();
        }


    }
}

