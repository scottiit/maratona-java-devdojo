package dojo.dev.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double salarioTotal;

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios != null) {
            System.out.println("Útimos " + salarios.length + " salários:");
            for (double salarioDaVez : salarios) {
                System.out.println(salarioDaVez);
            }
            mediaSalarial();
        }
    }

    public void mediaSalarial() {

        if (salarios == null) {
            return;
        }
        for (double salarioDaVez : salarios) {
            salarioTotal += salarioDaVez;
        }
        double mediaSalario = salarioTotal / salarios.length;
        System.out.println("Média salarial: " + mediaSalario);
        System.out.println();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
}
