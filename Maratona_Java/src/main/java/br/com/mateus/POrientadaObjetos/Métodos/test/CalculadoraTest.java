package br.com.mateus.POrientadaObjetos.Métodos.test;

import br.com.mateus.POrientadaObjetos.Métodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Somando dois numeros - sem parametros");
        calculadora.somaDoisNumeros();

        System.out.println("Subtraindo dois numeros - sem parametros");
        calculadora.subtraiDoisNumeros();

        System.out.println("Multiplicando dois numeros - COM parametros");
        calculadora.multiplicaDoisNumeros(10, 200);

        System.out.println("Dividindo dois numeros - COM parametros");
        double result = calculadora.divideDoisNumeros(100,10);
        System.out.println(result);
    }
}
