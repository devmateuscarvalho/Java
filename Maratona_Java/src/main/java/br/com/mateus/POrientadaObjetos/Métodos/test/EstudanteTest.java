package br.com.mateus.POrientadaObjetos.Métodos.test;

import br.com.mateus.POrientadaObjetos.Métodos.dominio.Estudante;
import br.com.mateus.POrientadaObjetos.Métodos.dominio.ImpressoraEstudantes;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudantes impressoraEstudante = new ImpressoraEstudantes();


        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);

    }
}
