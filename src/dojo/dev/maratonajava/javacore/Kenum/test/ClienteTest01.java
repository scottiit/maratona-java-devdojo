package dojo.dev.maratonajava.javacore.Kenum.test;

import dojo.dev.maratonajava.javacore.Kenum.dominio.Cliente;
import dojo.dev.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("adriano1", TipoCliente.PESSOA_FISICA);
        Cliente cliente02 = new Cliente("adriano2", TipoCliente.PESSOA_FISICA);
        Cliente cliente03 = new Cliente("adriano3", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente04 = new Cliente("adriano4", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);


    }
}
