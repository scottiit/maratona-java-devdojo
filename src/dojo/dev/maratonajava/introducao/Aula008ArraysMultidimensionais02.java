package dojo.dev.maratonajava.introducao;

public class Aula008ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrINT = new int[3][];
        int[]array = {1,2,3};
        arrINT [0] = new int[2];
        arrINT [1] = array;
        arrINT [2] = new int[]{1,2,3,4,5,6};

        int[][] array2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int[] arrBase: array2){
            System.out.println("\n------------");
            int contador = 0;
            for (int num: arrBase){
                System.out.print("posição "+contador+" = ");
                contador++;
                System.out.println(num);
            }
        }
    }
}
