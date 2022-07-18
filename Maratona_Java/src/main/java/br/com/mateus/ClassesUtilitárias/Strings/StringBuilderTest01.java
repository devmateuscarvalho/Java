package br.com.mateus.ClassesUtilitárias.Strings;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Mateus Carvalho";
        nome = nome.concat(" Vieira");
        System.out.println(nome);
        System.out.println("---------");

        StringBuilder sb = new StringBuilder("Mateus Carvalho");
        sb.append(" Vieira").append(" Legal");

       
        System.out.println(sb);
    }
}
