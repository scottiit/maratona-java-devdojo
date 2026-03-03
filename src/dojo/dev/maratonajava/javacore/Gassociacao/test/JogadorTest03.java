package dojo.dev.maratonajava.javacore.Gassociacao.test;

import dojo.dev.maratonajava.javacore.Gassociacao.domain.Jogador;
import dojo.dev.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Cafu");
        Jogador jogador02 = new Jogador("Cristiano");
        Time time01 = new Time("Brasil");
        Jogador[] jogadores = {jogador01, jogador02};

        jogador01.setTime(time01);
        time01.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador01.imprime();

        System.out.println("---  Time   ---");
        time01.imprime();




    }
}
