package br.com.mateus.POrientadaObjetos.Arrays;

public class For {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        nomes[0] = "Goku";
        nomes[1] = "Sakura";
        nomes[2] = "Naruto";
        nomes[3] = "Jirayia";
        nomes[4] = "Sasuke";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        int[] numeros = new int[3];
        int[] numeros2 = {0,1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};
        System.out.println("----Numeros1------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("----Numeros2------");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        System.out.println("----Numeros3------");
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }


        System.out.println("-----ForEach----");
        for (int num: numeros3) {
            System.out.println(num);

        }
    }
}
