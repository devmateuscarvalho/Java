package br.com.mateus.ClassesUtilitárias.Strings;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Mateus"; //String constant pool
        String nome2 = "Mateus";
        String nomeCompleto = nome.concat(" Carvalho"); //nomeCompleto += " Carvalho"
        System.out.println(nome == nome2);


        String nome3 = new String("Mateus"); //Cria um objeto de string q faz referencia na classe String
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
