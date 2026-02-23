package dojo.dev.maratonajava.introducao;

public class Aula005EstrututrasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 45000;
        double imposto;
        if (salarioAnual <= 34712){
            imposto = salarioAnual * 0.097;
        }else if(salarioAnual <= 68507){
            imposto = salarioAnual * 0.3735;
        }else{
            imposto = salarioAnual * 0.4950;
        }
        System.out.println("total imposot a ser pago: "+imposto);
    }
}
