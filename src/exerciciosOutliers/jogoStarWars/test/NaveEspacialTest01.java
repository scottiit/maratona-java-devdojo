package exerciciosOutliers.jogoStarWars.test;

import exerciciosOutliers.jogoStarWars.domain.NaveEspacial;
// testando o git push de novo
public class NaveEspacialTest01 {
    public static void main(String[] args) {
        NaveEspacial nave01 = new NaveEspacial();
        nave01.setNome("Millenium Falcon");
        nave01.setNivelEscudo(-420);
        nave01.setPoderDosCanhoes(new double[]{114, 362, 110, 114});

        nave01.exibirStatus();
        System.out.println("Poder total dos canhões: "+nave01.calcularPoderTotal()+"\n");

        NaveEspacial nave02 = new NaveEspacial();
        nave02.setNome("X-Wing");
        nave02.setNivelEscudo(701);
        //nave02.poderDosCanhoes = new double[]{116, 350, 112, 100};

        nave02.exibirStatus();
        System.out.println("Poder total dos canhões: "+nave02.calcularPoderTotal());

        nave01.atacar(nave02);
        nave02.atacar(nave01);



    }

}
