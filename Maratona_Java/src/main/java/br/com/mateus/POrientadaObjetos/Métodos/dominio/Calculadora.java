package br.com.mateus.POrientadaObjetos.Métodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(30-7);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        return num1/num2;
    }
    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+numero1);
        System.out.println("Num2 "+numero2);
}}
