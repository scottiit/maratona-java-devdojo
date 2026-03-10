package dojo.dev.maratonajava.javacore.Hheranca.test;

import dojo.dev.maratonajava.javacore.Hheranca.domain.Endereco;
import dojo.dev.maratonajava.javacore.Hheranca.domain.Funcionario;
import dojo.dev.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco01 = new Endereco();
        endereco01.setRua("Rua dos presidentes");
        endereco01.setCep("681231-231");

        Pessoa pessoa01 = new Pessoa("Dorivaldo");
        pessoa01.setCpf("123.123.123-12");
        pessoa01.setEndereco(endereco01);

        pessoa01.imprime();

        System.out.println();

        Funcionario funcionario01 = new Funcionario("Roberto");
        funcionario01.setCpf("321.321.321-32");
        Endereco endereco02 = new Endereco();
        endereco02.setCep("683213-213");
        endereco02.setRua("Rua dos delegados");
        funcionario01.setEndereco(endereco02);
        funcionario01.setSalario(1621.00);

        funcionario01.imprime();
        funcionario01.relatorioPagamento();


    }
}
