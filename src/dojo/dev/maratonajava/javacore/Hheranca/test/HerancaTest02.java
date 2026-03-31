package dojo.dev.maratonajava.javacore.Hheranca.test;

import dojo.dev.maratonajava.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    // © - Bloco de inicializacdo estático da super classe é executado quando a JVM carregar classe pai
    // 1 - Bloco de inicializagdo estático da sub classe é executado quando a JVM carregar classe filha
    // 2 - Alocado espaco em memória pro objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o quer for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado espaço em memória pro objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicializagdo da subclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Endrio");
    }
}
