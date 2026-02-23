package exerciciosOutliers.RastreadorVendas;

public class RastreadorVendas {
    public static void main(String[] args) {
        double[] vendasSemana = {150.5, 200.0, 50.0, 0.0, 320.0, 100.0, 90.5};
        double totalVendasSemana = 0;
        int diasSemVenda = 0;
        double maiorVenda = 0;
        for (int i = 0; i < vendasSemana.length; i++) {
            totalVendasSemana += vendasSemana[i];
            if (vendasSemana[i] == 0) {
                diasSemVenda++;
            }
            if (maiorVenda <= vendasSemana[i]){
                maiorVenda = vendasSemana[i];
            }
        }

        System.out.println("Total de vendas na semana: "+totalVendasSemana);
        System.out.println("Quantidade de dias sem venda: "+diasSemVenda);
        System.out.println("Maior venda: "+maiorVenda);
    }
}
