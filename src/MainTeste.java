import classes.PessoaFisica;

import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int escolha;
        char continuar;
        PessoaFisica pf = new PessoaFisica();
        System.out.println("TESTES");

        do{
            System.out.println("====================================================");
            System.out.println("MENU ESCOLHA");
            System.out.println("1 - Add");
            System.out.println("2 - read");
            System.out.println("3 - update");
            System.out.println("4 - delete");
            System.out.println("5 - listAll");
            System.out.println("====================================================");

            System.out.println("Digite sua opcao: ");
            escolha = ent.nextInt();
            ent.nextLine();

            switch (escolha){
                case 1:
                    System.out.println("a");
                    break;
                case 2:
                    //a
                    System.out.println("b");
                    break;
                case 3:
                    System.out.println("c");
                    break;
                case 4:
                    System.out.println("d");
                    break;
                case 5:
                    System.out.println("e");
                    break;
                default:
                    System.out.println("Está opção não está disponivel.");
            }

            System.out.println("Deseja continuar?(s / n)");
            continuar = ent.nextLine().charAt(0);

        }while(continuar != 'n');
    }
}
