package dojo.dev.maratonajava.javacore.Aintroducaoclasses.test;

import dojo.dev.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("----------------------------");
        Estudante estudante02 = new Estudante();
        estudante02.nome = "Eduarda";
        System.out.println(estudante02.nome);

    }
}
