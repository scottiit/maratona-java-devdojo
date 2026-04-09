package dojo.dev.maratonajava.javacore.JmodificadorFinal.test;

import dojo.dev.maratonajava.javacore.JmodificadorFinal.domain.Carro;
import dojo.dev.maratonajava.javacore.JmodificadorFinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro01.COMPRADOR);
        carro01.COMPRADOR.setNome("Joao");
        System.out.println(carro01.COMPRADOR);
        Ferrari ferrari01 = new Ferrari();
        ferrari01.setNome("Enzo");
        ferrari01.imprime();
    }
}
