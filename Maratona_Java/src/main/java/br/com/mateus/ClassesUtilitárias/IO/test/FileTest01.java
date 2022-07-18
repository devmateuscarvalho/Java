package br.com.mateus.ClassesUtilitárias.IO.test;

import java.io.File;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Mateus\\IdeaProjects\\JavaOnline\\Arquivo\\file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: "+isCreated);
            System.out.println("path "+file.getPath());
            System.out.println("path absolute "+file.getAbsolutePath());
            System.out.println("is directory? "+file.isDirectory());
            System.out.println("is file? "+file.isFile());
            System.out.println("is hidden? "+file.isHidden());
            System.out.println("is hidden? "+file.isHidden());
            System.out.println("last modified "+ new Date(file.lastModified()));
            boolean exists = file.exists();
            if(exists){
                System.out.println(file.delete());}

        }catch (Exception e){
            e.printStackTrace();
        }

    }}