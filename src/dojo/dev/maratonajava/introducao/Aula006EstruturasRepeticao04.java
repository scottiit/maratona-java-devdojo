package dojo.dev.maratonajava.introducao;

public class Aula006EstruturasRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 42716.98;

        double valorMinimoParcela = 1000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < valorMinimoParcela) {
                break;
            }

            System.out.println(parcela + " parcelas de R$" + valorParcela);
        }
    }

}