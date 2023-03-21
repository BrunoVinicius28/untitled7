import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Serie[] series = new Serie[50];
        Plataforma p = new Plataforma();
        p.nome = "Netflix";

        while (true) {
            System.out.println("MENU");
            System.out.println("1 - Adicionar serie");
            System.out.println("2 - Mostrar informações");
            System.out.println("3 - Mostrar nome da serie com o maior nuemero de temporadas que ja foi finalizada");
            System.out.println("4 - Calcular A porcentagem do número de séries e a média aritmética de notas das que possuem 3 ou mais temporadas");
            System.out.println("0 - Sair");
            System.out.print("Opção escolhida: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome da serie: ");
                    String nomeSerie = scanner.nextLine();
                    System.out.print("nota da serie");
                    double notaSerie = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Numero de temporadas: ");
                    int tempSerie = scanner.nextInt();
                    boolean finalizada = scanner.nextLine().equalsIgnoreCase("s");
                    Serie se = new Serie(nomeSerie, notaSerie, tempSerie, finalizada);
                    p.addSerie(se);
                    break;

                case 2:
                    p.mostraInfo();
                    break;

                 /*
                case 3:
                    plataforma.mostrarJogoMaisCaroMaisBarato();
                    break;

                case 4:
                    int count = plataforma.contarJogosComDlc();
                    System.out.println("Número de jogos com DLC: " + count);
                    break;
                  */

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }


}


