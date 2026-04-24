package dojo.dev.maratonajava.javacore.Lclassesabstratas.test;

import dojo.dev.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import dojo.dev.maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import dojo.dev.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente01 = new Gerente("Fabielen", 4000);
        System.out.println(gerente01);
        Desenvolvedor desenvolvedor01 = new Desenvolvedor("Mário", 5000);
        System.out.println(desenvolvedor01);
    }
}
