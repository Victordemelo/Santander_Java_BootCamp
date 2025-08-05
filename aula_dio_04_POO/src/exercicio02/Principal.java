package exercicio02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de usuários
        Gerente gerente = new Gerente("Narinha", "teste12345@gmail.com", "Nara123", true);
        Vendedor vendedor = new Vendedor("Vitinho", "victorm1234@gmail.com", "Victor22", false, 0);
        Atendente atendente = new Atendente("José Auberto", "Joseauberto1234@gmail.com", "admin1234", false, 0);

        int opcao;

        do {
            System.out.println("\n===== MENU DO SISTEMA =====");
            System.out.println("1 - Login como Gerente");
            System.out.println("2 - Login como Vendedor");
            System.out.println("3 - Login como Atendente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    gerente.realizarLogin();
                    gerente.relatorioFinanceiro(vendedor, atendente);
                    gerente.realizarLogoff();
                    break;

                case 2:
                    vendedor.realizarLogin();
                    vendedor.realizarVenda();
                    vendedor.realizarLogoff();
                    break;

                case 3:
                    atendente.realizarLogin();
                    atendente.receberPagamento(vendedor);
                    atendente.fecharCaixa();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
