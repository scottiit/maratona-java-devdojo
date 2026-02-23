package dojo.dev.maratonajava.introducao;

public class Aula006EstruturasRepeticao02 {
    public static void main(String[] args) {
        int contador1m = 1;
        while (contador1m <= 1000000) {
            if (contador1m % 2 == 0) {
                System.out.println(contador1m);
            }
            contador1m++;
        }

//        for(int i = 0; i <=1000000; i ++){
//            if (i %2==0){
//                System.out.println(i);
//            }
//        }
    }
}
