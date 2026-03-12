package exerciciosOutliers.jogoStarWars.test;

import exerciciosOutliers.jogoStarWars.domain.NaveDeCarga;
import exerciciosOutliers.jogoStarWars.domain.NaveEspacial;
import exerciciosOutliers.jogoStarWars.domain.Piloto;

public class NaveEspacialTest01 {
    public static void main(String[] args) {

        NaveDeCarga nave01 = new NaveDeCarga("Millenium Falcon", -420, new String[]{"adriano", "vander", "filipe"}, 500);
        nave01.setPoderDosCanhoes(new double[]{114, 362, 110, 114});
        Piloto piloto01 = new Piloto("Han Solo");
        nave01.setPiloto(piloto01);


        nave01.exibirStatus();
        System.out.println("Poder total dos canhões: " + nave01.calcularPoderTotal());
        nave01.exibirCarga();
        System.out.println("-------------------------------------------------------------------");

        NaveEspacial nave02 = new NaveEspacial("X-Wing", 701);
        //nave02.poderDosCanhoes = new double[]{116, 350, 112, 100};
        nave02.setTripulantes(new String[]{"tripu1", "tripu2", "tripu3" });
        nave02.setTripulantes(new String[]{"tripu4", "tripu5", "tripu6" });

        nave02.exibirStatus();
        System.out.println("Poder total dos canhões: " + nave02.calcularPoderTotal());

        nave01.atacar(nave02);
        nave02.atacar(nave01);

        System.out.println("\nQuantidade de naves: " + NaveEspacial.getContadorNaves());

    }

}
