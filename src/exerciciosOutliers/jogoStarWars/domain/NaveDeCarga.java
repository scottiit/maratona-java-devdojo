package exerciciosOutliers.jogoStarWars.domain;

public class NaveDeCarga extends NaveEspacial {
    private int capacidadeDeCarga;

    public NaveDeCarga(String nome, int nivelEscudo, String[] tripulantes) {
        super(nome, nivelEscudo, TipoNave.CARGUEIRO, tripulantes);
    }

    public NaveDeCarga(String nome, int nivelEscudo, String[] tripulantes, int capacidadeDeCarga) {
        super(nome, nivelEscudo, TipoNave.CARGUEIRO, tripulantes);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public void exibirCarga(){
        System.out.println("A nave de carga "+this.nome+", do piloto "+this.getPiloto().getNome()+", está transportando "+this.capacidadeDeCarga+" toneladas ");
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
}
