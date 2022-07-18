package br.com.mateus.POrientadaObjetos.Métodos_Exercicio.teste;

import br.com.mateus.POrientadaObjetos.Métodos.dominio.Calculadora;
import br.com.mateus.POrientadaObjetos.Métodos_Exercicio.dominio.Funcionario;
import br.com.mateus.POrientadaObjetos.Métodos_Exercicio.dominio.Impressora;

public class FuncionarioTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Funcionario funcionario = new Funcionario();
        Impressora impressora = new Impressora();
        Funcionario funcionario2 = new Funcionario();

        funcionario2.setNome("João");

        funcionario.setNome("Mateus");
        funcionario.setIdade(23);
        funcionario.setSalario(new double[]{1200, 1300, 1400});

        for (int i = 0; i < funcionario.salario.length; i++) {
            System.out.println("Salario "+i);
            System.out.println(funcionario.salario[i]);

        }

    }
}
