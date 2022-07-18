package br.com.mateus.POrientadaObjetos.Associação.Arrays_com_Objetos.test;

import br.com.mateus.POrientadaObjetos.Associação.Arrays_com_Objetos.dominio.Jogador;
import br.com.mateus.POrientadaObjetos.Associação.Arrays_com_Objetos.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();

    }
}
