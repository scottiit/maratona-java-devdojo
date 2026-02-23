package dojo.dev.maratonajava.javacore.Fmodificadoresestaticos.test;

import dojo.dev.maratonajava.javacore.Fmodificadoresestaticos.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro("bmw", 280);
        Carro carro02 = new Carro("mercedes", 275);
        Carro carro03 = new Carro("audi", 290);
        Carro.setVelocidadeLimite(180);

        carro01.imprime();
        carro02.imprime();
        carro03.imprime();




    }
}
