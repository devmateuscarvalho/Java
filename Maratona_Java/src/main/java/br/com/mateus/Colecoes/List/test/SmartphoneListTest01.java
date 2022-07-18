package br.com.mateus.Colecoes.List.test;

import br.com.mateus.Colecoes.List.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABCD1", "iPhone");
        Smartphone s2 = new Smartphone("2M387F", "Samsung");
        Smartphone s3 = new Smartphone("3M587D", "Xiaomi");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone : smartphones
        ) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("3M587D", "Xiaomi");
        System.out.println(smartphones.contains(s4));
    }
}
