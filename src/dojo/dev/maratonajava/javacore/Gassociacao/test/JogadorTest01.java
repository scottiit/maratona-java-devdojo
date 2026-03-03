package dojo.dev.maratonajava.javacore.Gassociacao.test;

import dojo.dev.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Neymar");
        Jogador jogador03 = new Jogador("Adriano");

        Jogador[] jogadores = new Jogador[]{jogador01,jogador02, jogador03};

        for (Jogador jogador : jogadores) {
            jogador.imprime();

        }


    }
}
