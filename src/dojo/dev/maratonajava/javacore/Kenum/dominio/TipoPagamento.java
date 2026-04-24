package dojo.dev.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    }, CREBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.025;
        }
    };


    public abstract double calcularDesconto(double valor);
}