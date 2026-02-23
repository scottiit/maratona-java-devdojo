package dojo.dev.maratonajava.introducao;

public class Aula007Arrays01 {
    public static void main(String[] args) {

        int[] idades = new int[3];
        idades[0] = 20;
        idades[1] = 21;
        idades[2] = 22;

        for (int i = 0; i < 3; i++) {
            System.out.println(idades[i]);
        }
    }
}
