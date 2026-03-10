package dojo.dev.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraInputTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo:");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade abaixo:");
        int idade = scanner.nextInt();       
        System.out.println("Digite seu sexo abaixo: (F || M)");
        char sexo = scanner.next().charAt(0);

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);



    }
}
