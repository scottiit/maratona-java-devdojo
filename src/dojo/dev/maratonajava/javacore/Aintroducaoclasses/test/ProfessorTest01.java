package dojo.dev.maratonajava.javacore.Aintroducaoclasses.test;

import dojo.dev.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Octavio";
        professor.idade = 30;
        professor.sexo = 'M';
        System.out.println(professor.nome+" "+professor.idade+" "+professor.sexo);
    }
}
