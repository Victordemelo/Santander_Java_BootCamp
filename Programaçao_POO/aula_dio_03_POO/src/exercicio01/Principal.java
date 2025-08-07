package exercicio01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Banco banco = new Banco(0, 0, 0, 0);
        Usuario usuario = new Usuario(null, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja muito bem vindo ao Banco Central, deseja criar uma conta?");
        System.out.println("Y/N");
        String criarconta = scanner.nextLine().toUpperCase();

        if (criarconta.equals("Y")) {
            System.out.printf("Digite o seu Nome: ");
            String nome = scanner.nextLine();
            usuario.setNome(nome);

            System.out.printf("Digite a sua idade: ");
            int idade = scanner.nextInt();
            usuario.setIdade(idade);

            System.out.printf("Digite o seu primeiro Depósito: ");
            int primeiroDeposito = scanner.nextInt();
            banco.setPrimeiroDeposito(primeiroDeposito);

        } else if (criarconta.equals("N")) {
            System.exit(0);
        } else {
            System.out.println("Opção Inválida.");
            System.exit(0);
        }

        int opcao = -1;
        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("    Bem-vindo ao seu banco    ");
            System.out.println("    Digite a opção desejada   ");
            System.out.println("==============================");
            System.out.println("1 - Depositar Saldo");
            System.out.println("2 - Retirar Saldo");
            System.out.println("3 - Consutar Saldo");
            System.out.println("4 - Consultar Saldo com Cheque Especial");
            System.out.println("5 - Consultar se está utilizando cheque especial");
            System.out.println("6 - Pagar um boleto");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.printf("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    banco.depositarSaldo(valorDeposito);
                }
                case 2 -> {
                    System.out.printf("Digite o valor para realizar o Saque: ");
                    double valorSaque = scanner.nextDouble();
                    banco.retirarSaldo(valorSaque);
                }
                case 3 -> System.out.printf("O seu saldo atual é R$: %.2f", banco.getSaldo());
                case 4 -> System.out.printf("O seu saldo atual com cheque especial é R$: %.2f", banco.saldoTotal());
                case 5 -> banco.verificarCheque();
                case 6 -> {
                    System.out.printf("Digite o valor do boleto: ");
                    double valorBoleto = scanner.nextDouble();
                    banco.pagarBoleto(valorBoleto);
                }
                default -> System.out.println("Opção Inválida.");

            }

        } while (opcao != 0);

        scanner.close();
    }
}

// consultar saldo
// consultar cheque especial
// depositar dinheiro
// sacar dinheiro
// pagar um boleto
// verificar se a conta está usando cheque especial

/*
 * A conta bancária deve ter um limite de cheque
 * especial somado ao saldo da conta
 */

/*
 * O o valor do cheque especial é definido no momento da criação da conta, de
 * acordo com o valor depositado na conta em sua criação;
 * - Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque
 * especial deve ser de R$50,00
 * - Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor
 * depositado;
 */

/*- Caso o limite de cheque especial seja usado, assim que possível a conta
 deve cobrar uma taxa de 20% do valor usado do cheque especial.
*/
