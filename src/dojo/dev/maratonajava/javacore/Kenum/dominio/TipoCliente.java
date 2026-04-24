package dojo.dev.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int valor;
    public final String nomeExtenso;

    TipoCliente(int valor, String extenso){
        this.valor = valor;
        this.nomeExtenso = extenso;
    }
    public static TipoCliente tipoClientePorNomeExtenso(String nomeExtenso){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeExtenso().equals(nomeExtenso)){
                return tipoCliente;
            }
            
        }
        return null;

    }

    public int getValor() {
        return valor;
    }

    public String getNomeExtenso() {
        return nomeExtenso;
    }
}
