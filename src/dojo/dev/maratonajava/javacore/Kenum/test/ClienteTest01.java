package dojo.dev.maratonajava.javacore.Kenum.test;

import dojo.dev.maratonajava.javacore.Kenum.dominio.Cliente;
import dojo.dev.maratonajava.javacore.Kenum.dominio.TipoCliente;
import dojo.dev.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("lucian", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("mario", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREBITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeExtenso("Pessoa Física");
        System.out.println(tipoCliente);



    }
}
