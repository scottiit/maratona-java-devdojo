package dojo.dev.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraInputTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Pensamento Profundo ");
        System.out.println("Faça sua pergunta e eu responderei sim ou não: ");

        while (true){
            String pergunta = scanner.nextLine();
            if (pergunta.equals("exit")){
                System.out.println("Pensamento Profundo irá dormir.");
                break;
            }
            if (pergunta.charAt(0) == ' '){
                System.out.println("Sim");
            } else {
                System.out.println("Não");
            }
        }
    }
}
