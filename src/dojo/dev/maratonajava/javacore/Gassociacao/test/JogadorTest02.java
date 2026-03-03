package dojo.dev.maratonajava.javacore.Gassociacao.test;

import dojo.dev.maratonajava.javacore.Gassociacao.domain.Jogador;
import dojo.dev.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Romario");
        Jogador jogador02 = new Jogador("Ronaldo");
        Jogador jogador03 = new Jogador("Ronaldinho");

        Time time01 = new Time("Brazil");

        jogador01.setTime(time01);

        jogador01.imprime();
    }
}
