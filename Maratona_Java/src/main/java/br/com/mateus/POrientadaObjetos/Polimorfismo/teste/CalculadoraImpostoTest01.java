package br.com.mateus.POrientadaObjetos.Polimorfismo.teste;

import br.com.mateus.POrientadaObjetos.Polimorfismo.dominio.Computador;
import br.com.mateus.POrientadaObjetos.Polimorfismo.dominio.Tomate;
import br.com.mateus.POrientadaObjetos.Polimorfismo.servico.CalculadoraImposto;

public class CalculadoraImpostoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
