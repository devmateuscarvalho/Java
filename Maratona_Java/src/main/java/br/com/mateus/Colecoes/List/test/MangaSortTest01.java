package br.com.mateus.Colecoes.List.test;

import br.com.mateus.Colecoes.List.dominio.Manga;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Berserk",19.9));
        mangas.add(new Manga(1L,"Hellsing Ultimate",20.18));
        mangas.add(new Manga(4L,"Attack on titan",30.9));
        mangas.add(new Manga(2L,"Pokemon",15.9));
        mangas.add(new Manga(3L,"Dragon Ball Z",12.9));
        System.out.println(mangas);

    }
}
