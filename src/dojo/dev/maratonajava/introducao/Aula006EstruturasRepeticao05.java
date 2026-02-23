package dojo.dev.maratonajava.introducao;

public class Aula006EstruturasRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;

        double valorMinimoParcela = 1000;

        for (int parcela = (int)valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela <1000){
                continue;
            }
            System.out.println(parcela + " parcelas de R$" + valorParcela);
        }

    }

}