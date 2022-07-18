package br.com.mateus.Throwable.Exception.Teste;

import br.com.mateus.Throwable.Exception.dominio.Funcionario;
import br.com.mateus.Throwable.Exception.dominio.LoginInvalidoException;
import br.com.mateus.Throwable.Exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) throws FileNotFoundException, LoginInvalidoException {
        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();

        funcionario.salvar();
        pessoa.salvar();
    }
}
