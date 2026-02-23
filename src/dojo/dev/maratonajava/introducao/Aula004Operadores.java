package dojo.dev.maratonajava.introducao;

public class Aula004Operadores {
    public static void main(String[] args) {
        // + - / *
        int num1 = 10;
        int num2 = 20;
        double resultado =  num1 / (double) num2;
        System.out.println(num2 - num1+" Valor "+num2+num1);
        System.out.println(resultado);

        // %
        int resto= 20%2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        System.out.println("isDezMaiorVinte "+isDezMaiorVinte);
        System.out.println("isDezMenorVinte "+isDezMenorVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);

        // && (AND)  || (OR) ! (logical not)
        int idade = 35;
        double salario = 3500;
        boolean isDentroLeiMaiorTrinta = idade > 30 && salario >= 4612;
        boolean isDentroLeiMenorTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroLeiMaiorTrinta " +isDentroLeiMaiorTrinta);
        System.out.println("isDentroLeiMenoorTrinta " +isDentroLeiMenorTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPs5 = 5000;

        boolean isPs5Compravel = valorTotalContaCorrente > valorPs5 || valorTotalContaPoupanca > valorPs5;
        System.out.println("isPs5Compravel "+isPs5Compravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println("bonus = "+bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador ++;
        System.out.println(contador);



    }
}
