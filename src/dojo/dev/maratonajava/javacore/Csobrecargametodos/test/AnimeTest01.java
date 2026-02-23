package dojo.dev.maratonajava.javacore.Csobrecargametodos.test;

import dojo.dev.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();
        Anime anime02 = new Anime();

        anime01.setEpisodios(934);
        anime01.setTipo("tv");
        anime01.setNome("no game no life");
        anime01.setGenero("isekai");

        anime01.imprime();

        System.out.println();

        anime02.init("boku no hero", "tv", 667, "shounen");


        anime02.imprime();

    }
}
