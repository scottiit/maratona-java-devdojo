package dojo.dev.maratonajava.javacore.Gassociacao.test;

import dojo.dev.maratonajava.javacore.Gassociacao.domain.Escola;
import dojo.dev.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Octavio  z");
        Professor professor02 = new Professor("Diego");
        Professor[] professores = {professor01, professor02};
        Escola escola01 = new Escola("CSRN", professores);

        escola01.imprime();
    }
}
