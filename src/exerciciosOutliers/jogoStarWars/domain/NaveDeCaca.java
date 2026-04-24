package exerciciosOutliers.jogoStarWars.domain;

public class NaveDeCaca extends NaveEspacial{
    public NaveDeCaca(String nome, int nivelEscudo, TipoNave tipoNave) {
        super(nome, nivelEscudo, tipoNave.CAÇA);
    }

    public NaveDeCaca(String nome, int nivelEscudo, TipoNave tipoNave, String[] tripulantes) {
        super(nome, nivelEscudo, tipoNave.CAÇA, tripulantes);
    }
}
