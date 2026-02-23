package dojo.dev.maratonajava.introducao;

public class Aula005EstrututrasCondicionais01 {
    public static void main(String[] args) {
        int age = 17;
        boolean isAutorizadoBeber = age >= 18;
        if (isAutorizadoBeber) {
            System.out.println("pode beber");
        }else{
            System.out.println("Else: Não pode beber");
        }

        if (!isAutorizadoBeber) {
            System.out.println("Não pode beber");
        }
    }
}
