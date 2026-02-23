package dojo.dev.maratonajava.introducao;

public class Aula005EstrututrasCondicionais02 {
    public static void main(String[] args) {
        int player_age = 18;
        String categoria;
        if (player_age < 15){
            categoria = ("Jogador faz parte da categoria infantil");
        } else if (player_age >= 15 && player_age < 18) {
            categoria = ("jogador faz parte da categoria juvenil");
        }else{
            categoria = ("jogador faz parte da categoria adulto");
        }
        System.out.println(categoria);
    }
}
