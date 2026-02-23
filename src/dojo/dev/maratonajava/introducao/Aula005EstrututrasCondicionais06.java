package dojo.dev.maratonajava.introducao;

public class Aula005EstrututrasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 1;
        String diaSemana = "";
        String diaUtil = "é dia útil";
//        switch (dia) {
//            case 1:
//                diaSemana = "Domingo";
//                diaUtil = "não é dia útil";
//                break;
//            case 2:
//                diaSemana = "segunda";
//                break;
//            case 3:
//                diaSemana = "ter";
//                break;
//            case 4:
//                diaSemana = "quar";
//                break;
//            case 5:
//                diaSemana = "qui";
//                break;
//            case 6:
//                diaSemana = "sex";
//                break;
//            case 7:
//                diaSemana = "sab";
//                diaUtil = "não é dia útil";
//                break;
//            default:
//                System.out.println("input inválido");
//        }
//        System.out.println("o dia da semana é "+diaSemana+" que "+diaUtil);
        switch (dia) {
            case 1:
            case 7:
                System.out.println("fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("útil");
                break;

        }

    }
}
