package dojo.dev.maratonajava.introducao;

public class Aula006EstruturasRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int contador = 12;
//        while (contador < 10) {
//            System.out.println(++contador);
//        }
        do {
            System.out.println(contador);
        } while (contador < 10);

        for(int i= 1; i<=10; ++i){
            System.out.println("for "+i);
        }
    }
}
