package dojo.dev.maratonajava.javacore.Bintroducaometodos.test;

import dojo.dev.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class calculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(3, 10);
        double result = calculadora.divideDoisNumeros(45, 4.5);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(45, 4));

        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(1,2,3,4,5);

    }
}
