package dojo.dev.maratonajava.javacore.Aintroducaoclasses.test;

import dojo.dev.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Nissan";
        carro1.modelo = "GTR R32";
        carro1.ano = 1996;
        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 1998;

        carro2 =carro1;

        System.out.println("Carro 1:\n> Marca: "+carro1.marca+"\n> Modelo: "+carro1.modelo+"\n> Ano: "+carro1.ano);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Carro 2:\n> Marca: "+carro2.marca+"\n> Modelo: "+carro2.modelo+"\n> Ano: "+carro2.ano);
    }
}
