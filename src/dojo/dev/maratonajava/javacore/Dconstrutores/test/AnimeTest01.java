package dojo.dev.maratonajava.javacore.Dconstrutores.test;


import dojo.dev.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime("no game no life", "tv",934, "isekai", "production ig");
        Anime anime02 = new Anime("boku no hero", "tv",667, "shounen");
        Anime anime03 = new Anime();

        anime01.imprime();

        System.out.println();

        anime02.imprime();

        System.out.println();

        anime03.imprime();

    }
}
