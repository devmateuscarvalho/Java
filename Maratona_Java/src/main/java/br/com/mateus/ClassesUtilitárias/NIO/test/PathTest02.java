package br.com.mateus.ClassesUtilitárias.NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
       Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)){
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }

        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectory(subPastaPath);

        Path filePath = Paths.get(subPastaPath.toString());
        if (Files.notExists(pastaPath)){
        Path filePathCreated = Files.createFile(filePath);

        }}}



