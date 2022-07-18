package br.com.mateus.POrientadaObjetos.Polimorfismo.teste;

import br.com.mateus.POrientadaObjetos.Polimorfismo.dominio.Computador;
import br.com.mateus.POrientadaObjetos.Polimorfismo.dominio.Produto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

    }
}
