package br.com.mateus.POrientadaObjetos.Polimorfismo.servico;

import br.com.mateus.POrientadaObjetos.Polimorfismo.dominio.Computador;
import br.com.mateus.POrientadaObjetos.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador "+computador.getNome());
        System.out.println("Valor"+computador.getValor());
        System.out.println("Imposto a ser pago"+imposto);
    }
    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do computador "+tomate.getNome());
        System.out.println("Valor"+tomate.getValor());
        System.out.println("Imposto a ser pago"+imposto);
    }
}
