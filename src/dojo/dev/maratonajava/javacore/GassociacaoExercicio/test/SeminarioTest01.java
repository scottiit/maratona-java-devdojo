package dojo.dev.maratonajava.javacore.GassociacaoExercicio.test;

import dojo.dev.maratonajava.javacore.GassociacaoExercicio.main.Aluno;
import dojo.dev.maratonajava.javacore.GassociacaoExercicio.main.Local;
import dojo.dev.maratonajava.javacore.GassociacaoExercicio.main.Professor;
import dojo.dev.maratonajava.javacore.GassociacaoExercicio.main.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local01 = new Local("Escola A");
        Seminario seminario01 = new Seminario("Seminario 01");
        Aluno aluno01 = new Aluno("Adriano", 21);
        Aluno aluno02 = new Aluno("Eduarda", 20);
        Professor professor01 = new Professor("Octavio", "Filosofia");

        Aluno[] alunos = {aluno01, aluno02};
        seminario01.setLocal(local01);
        Seminario[] seminarios = {seminario01};

        professor01.setSeminarios(seminarios);



        seminario01.setAlunos(alunos);


        professor01.imprime();
    }


}
