package exercicio02;

import java.util.Scanner;

import exercicio02.Produtos.Alimentacao;
import exercicio02.Produtos.Cultura;
import exercicio02.Produtos.SaudeEBemEstar;
import exercicio02.Produtos.Vestuario;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Tributos tributos = null;

        int option = -1;
        while (option != 0) {

            System.out.println("Escola o produto que você comprou: ");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Cultura");
            System.out.println("3 - Saude e Bem estar");
            System.out.println("4 - Vestuario");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            if (option == 1) {
                tributos = tributosAlimentacao();

            } else if (option == 2) {
                tributos = tributosCultura();

            } else if (option == 3) {
                tributos = tributosSaude();

            } else if (option == 4) {
                tributos = tributosVestuario();

            } else if (option == 0) {
                System.out.println("Saindo do sistema...");
                System.exit(0);
                break;

            } else {
                System.out.println("Opção Inválida.");
                continue;
            }

            System.out.printf("O valor do produto com imposto é %.2f\n",
                    tributos.getImpostos());
        }
    }

    private static Tributos tributosAlimentacao() {
        System.out.println("Digite o valor do produto: ");
        double saldo = scanner.nextDouble();
        return new Alimentacao(saldo);

    }

    private static Tributos tributosCultura() {
        System.out.println("Digite o valor do produto: ");
        double saldo = scanner.nextDouble();
        return new Cultura(saldo);

    }

    private static Tributos tributosVestuario() {
        System.out.println("Digite o valor do produto: ");
        double saldo = scanner.nextDouble();
        return new Vestuario(saldo);

    }

    private static Tributos tributosSaude() {
        System.out.println("Digite o valor do produto: ");
        double saldo = scanner.nextDouble();
        return new SaudeEBemEstar(saldo);

    }

}
