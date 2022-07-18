package br.com.mateus.Colecoes.List.test;

import java.util.ArrayList;
import java.util.List;

public class ListsTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList(300);
        nomes.add("Mateus");
        nomes.add("Giovanna");
        nomes.add("Azeitona");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        for (int i=0; i<nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}
