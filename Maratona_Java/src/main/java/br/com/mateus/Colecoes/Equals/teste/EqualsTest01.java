package br.com.mateus.Colecoes.Equals.teste;

import br.com.mateus.Colecoes.Equals.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABCD", "iPhone");
        Smartphone s2 = new Smartphone("1ABCD", "iPhone");
        System.out.println(s1.equals(s2));

    }
}
