package dojo.dev.maratonajava.introducao;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int contador = 0;
            int resultado= a;
            while (contador<n){
                int exp = (int) Math.pow(2, contador);
                resultado+=exp*b;
                System.out.print(resultado+" ");
                contador++;
            }
            System.out.println();
        }

        in.close();
    }
}

