package br.com.mateus.Colecoes.List.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Attack on titan");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");
        Collections.sort(mangas);
        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.2);
        dinheiros.add(21.21);
        dinheiros.add(98.10);
        Collections.sort(dinheiros);
        System.out.println("---Organizando dinheiro---");
        for (Double dinheiro: dinheiros){
            System.out.println(dinheiro);
        }
        System.out.println("---Organizando mangás---");
        for (String manga: mangas){
            System.out.println(manga);
        }
    }
}
