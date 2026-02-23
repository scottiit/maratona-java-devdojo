package dojo.dev.maratonajava.javacore.Bintroducaometodos.test;

import dojo.dev.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("adriano");
        pessoa01.setIdade(21);

        //pessoa01.imprime();
        System.out.println(pessoa01.getNome());
        System.out.println(pessoa01.getIdade());

        Pessoa pessoa02 = new Pessoa();
        pessoa02.setNome("sofia");
        pessoa02.setIdade(-10);

        pessoa02.imprime();
    }
}
