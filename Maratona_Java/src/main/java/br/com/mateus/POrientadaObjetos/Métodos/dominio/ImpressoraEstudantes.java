package br.com.mateus.POrientadaObjetos.Métodos.dominio;

public class ImpressoraEstudantes {
    public void imprime(Estudante estudante){
        System.out.println("---------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
