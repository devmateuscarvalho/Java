package br.com.mateus.POrientadaObjetos.Herança.Domínio;

public class Funcionario extends Pessoa {
    private double salario;

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
