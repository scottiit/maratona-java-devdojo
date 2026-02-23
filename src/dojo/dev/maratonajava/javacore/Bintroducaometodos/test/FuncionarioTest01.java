package dojo.dev.maratonajava.javacore.Bintroducaometodos.test;

import dojo.dev.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.setNome("Jurandir");
        funcionario1.setIdade(24);
        funcionario1.setSalarios(new double[]{1621.00, 1713.89, 1514.00});

        funcionario1.imprimeDados();
        //funcionario1.mediaSalarial();
        System.out.println("salariototal+ "+funcionario1.getSalarioTotal()  );

        funcionario2.setNome("Chunda");
        funcionario2.setIdade(69);
        //funcionario2.salarios = new double[]{2621.00, 2713.89, 2514.00};

        funcionario2.imprimeDados();
        //funcionario2.mediaSalarial();

    }
}
