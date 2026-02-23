package exerciciosGemini.jogoStarWars.domain;

public class NaveEspacial {
    private String nome;
    private int nivelEscudo;
    private double[] poderDosCanhoes;

    public void exibirStatus(){
        System.out.println("Nave: "+this.nome);
        System.out.println("Nível do escudo: "+this.nivelEscudo);
        if (this.poderDosCanhoes == null){
            System.out.println("Nenhum canhão encontrado");
            return;
        }
        int numcanhao=0;
        for (double canhao : this.poderDosCanhoes){
            numcanhao++;
            System.out.println("Canhão "+numcanhao+" Poder "+canhao);
        }
    }
    public double calcularPoderTotal(){
        double poderTotal = 0;
        if (this.poderDosCanhoes == null){
            return 0;
        }
        for(double canhao:this.poderDosCanhoes){
            poderTotal+=canhao;
        }
        return poderTotal;
    }
    public void atacar(NaveEspacial alvo){
        if (calcularPoderTotal()>alvo.getNivelEscudo()){
            System.out.println("A nave "+this.nome+" destruiu a "+alvo.nome);
        }else{
            System.out.println("O ataque da nave "+this.nome+" falhou contra o escudo da "+alvo.nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelEscudo() {
        return nivelEscudo;
    }

    public void setNivelEscudo(int nivelEscudo) {
        if (nivelEscudo<0){
            this.nivelEscudo = 0;
            return;
        }
        this.nivelEscudo = nivelEscudo;
    }

    public double[] getPoderDosCanhoes() {
        return poderDosCanhoes;
    }

    public void setPoderDosCanhoes(double[] poderDosCanhoes) {
        this.poderDosCanhoes = poderDosCanhoes;
    }
}
