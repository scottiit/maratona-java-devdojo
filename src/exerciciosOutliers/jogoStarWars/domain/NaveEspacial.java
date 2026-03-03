package exerciciosOutliers.jogoStarWars.domain;

public class NaveEspacial {
    private String nome;
    private int nivelEscudo;
    private double[] poderDosCanhoes;
    private static int contadorNaves = 0;
    private Piloto piloto;
    private String[] tripulantes;

    public NaveEspacial(String nome, int nivelEscudo) {
        contadorNaves++;
        this.nome = nome;
        if (nivelEscudo < 0) {
            this.nivelEscudo = 0;
            return;
        }
        this.nivelEscudo = nivelEscudo;

    }

    public NaveEspacial(String nome, int nivelEscudo, String[] tripulantes) {
        this(nome, nivelEscudo);
        this.tripulantes = tripulantes;
    }

    public void exibirStatus() {
        System.out.println("Nave: " + this.nome);
        if (this.piloto != null) {
            System.out.println("Piloto: " + this.piloto.getNome());
        } else {
            System.out.println("Sem piloto");
            System.out.println("Piloto automático ativado");
        }
        if (this.tripulantes != null) {
            System.out.println("Tripulantes:");
            for (String nomeTripulante : tripulantes) {
                System.out.println("- " + nomeTripulante);
            }
        } else {
            System.out.println("Nenhum tripulante");
        }
        System.out.println("Nível do escudo: " + this.nivelEscudo);
        if (this.poderDosCanhoes == null) {
            System.out.println("Nenhum canhão encontrado");
            return;
        }
        int numcanhao = 0;
        for (double canhao : this.poderDosCanhoes) {
            numcanhao++;
            System.out.println("Canhão " + numcanhao + " Poder " + canhao);
        }
    }

    public double calcularPoderTotal() {
        double poderTotal = 0;
        if (this.poderDosCanhoes == null) {
            return 0;
        }
        for (double canhao : this.poderDosCanhoes) {
            poderTotal += canhao;
        }
        return poderTotal;
    }

    public void atacar(NaveEspacial alvo) {
        if (calcularPoderTotal() > alvo.getNivelEscudo()) {
            System.out.println("A nave " + this.nome + " destruiu a " + alvo.nome);
        } else {
            System.out.println("O ataque da nave " + this.nome + " falhou contra o escudo da " + alvo.nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNivelEscudo() {
        return nivelEscudo;
    }

    public double[] getPoderDosCanhoes() {
        return poderDosCanhoes;
    }

    public void setPoderDosCanhoes(double[] poderDosCanhoes) {
        this.poderDosCanhoes = poderDosCanhoes;
    }

    public static int getContadorNaves() {
        return contadorNaves;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public String[] getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(String[] tripulantes) {
        this.tripulantes = tripulantes;
    }
}
