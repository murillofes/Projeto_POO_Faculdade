import serviço.Sistema;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar animal");
            System.out.println("2 - Listar animais");
            System.out.println("3 - Cadastrar vacina");
            System.out.println("4 - Listar vacinas");
            System.out.println("5 - Registrar vacinação");
            System.out.println("6 - Histórico de animal");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Espécie: ");
                    String especie = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();

                    sistema.cadastrarAnimal(nome, especie, idade);
                    break;

                case 2:
                    sistema.listarAnimais();
                    break;

                case 3:
                    System.out.print("Vacina: ");
                    String vnome = sc.nextLine();
                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();

                    sistema.cadastrarVacina(vnome, desc);
                    break;

                case 4:
                    sistema.listarVacinas();
                    break;

                case 5:
                    System.out.print("ID Animal: ");
                    int idA = sc.nextInt();
                    System.out.print("ID Vacina: ");
                    int idV = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Data: ");
                    String data = sc.nextLine();

                    sistema.registrarVacinacao(idA, idV, data);
                    break;

                case 6:
                    System.out.print("ID Animal: ");
                    int idHist = sc.nextInt();
                    sistema.historicoAnimal(idHist);
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}