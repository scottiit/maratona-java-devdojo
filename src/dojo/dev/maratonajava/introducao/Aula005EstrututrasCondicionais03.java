package dojo.dev.maratonajava.introducao;

public class Aula005EstrututrasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = ("eu vou doar 500 pila");
        String mensagemNaoDoar = ("eu NÃO vou doar 500 pila");
        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;

        /*
        String resultado;
        if (salario>5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }

         */
        System.out.println(resultado);

    }
}
