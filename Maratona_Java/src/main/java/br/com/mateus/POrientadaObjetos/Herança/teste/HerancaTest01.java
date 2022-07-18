package br.com.mateus.POrientadaObjetos.Herança.teste;

import br.com.mateus.POrientadaObjetos.Herança.Domínio.Endereco;
import br.com.mateus.POrientadaObjetos.Herança.Domínio.Funcionario;
import br.com.mateus.POrientadaObjetos.Herança.Domínio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("88070-480");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Mateus");
        pessoa.setCpf("092.435.629-40");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Giovanna");
        funcionario.setCpf("2039129031290");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();

        System.out.println(funcionario.getSalario());


    }
}
