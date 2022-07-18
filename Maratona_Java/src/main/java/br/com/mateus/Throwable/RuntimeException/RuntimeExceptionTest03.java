package br.com.mateus.Throwable.RuntimeException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
      abreConexao();
          }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo aquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;

    }
}
