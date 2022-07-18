package br.com.mateus.POrientadaObjetos.Enumeração.Teste;

import br.com.mateus.POrientadaObjetos.Enumeração.Domínio.Cliente;
import br.com.mateus.POrientadaObjetos.Enumeração.Domínio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Mateus", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Fernando", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Ornaldo", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Ramusho", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
