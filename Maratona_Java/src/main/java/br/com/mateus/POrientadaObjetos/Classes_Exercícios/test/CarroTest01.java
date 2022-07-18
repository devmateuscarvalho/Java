package br.com.mateus.POrientadaObjetos.Classes_Exercícios.test;

import br.com.mateus.POrientadaObjetos.Classes_Exercícios.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca Bala";
        carro1.ano = 1996;
        carro1.modelo = "Fuscão";

        carro2.nome = "Maverick";
        carro2.ano = 1978;
        carro2.modelo = "Dos filmes";

        System.out.println("--Carro 1--");
        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);
        System.out.println("--Carro 2--");
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);




    }
}
