package br.com.mateus.POrientadaObjetos.Interfaces.Dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagens");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
