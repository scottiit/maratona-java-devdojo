package dojo.dev.maratonajava.javacore.Eblocosinicializacao.test;

import dojo.dev.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime("one piece");

        for (int episodio : anime01.getEpisodios()) {
            System.out.print(episodio + ", ");
        }

    }
}
