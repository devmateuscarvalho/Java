package br.com.mateus.POrientadaObjetos.Classes.test;

import br.com.mateus.POrientadaObjetos.Classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        estudante01.idade = 25;
        estudante01.nome = "Mateus";
        estudante01.sexo = 'H';
        System.out.println("-Estudante 01-");
        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);


        Estudante estudante02 = new Estudante();
        estudante02.idade = 25;
        estudante02.nome = "Giovanna";
        estudante02.sexo = 'M';
        System.out.println("-Estudante 02-");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
    }
}
