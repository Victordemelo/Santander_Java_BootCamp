
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        BancoConta conta = null;
        Cliente cliente = new Cliente(null, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você deseja criar uma conta no banco? (Y/N)");
        String palavra = scanner.nextLine();

        if (palavra.equalsIgnoreCase("Y")) {
            System.out.printf("Digite o seu nome: ");
            String tempNome = scanner.nextLine();
            cliente.setNome(tempNome);

            System.out.printf("Digite a sua idade: ");
            int idade = scanner.nextInt();
            cliente.setIdade(idade);

            System.out.println("Você quer abrir uma ContaPoupanca ou Conta Corrente? (CC/CP)");
            String escConta = scanner.next();

            if (escConta.equalsIgnoreCase("CC")) {
                conta = new ContaCorrente(0, 0, 0);
                conta.setCliente(cliente);
                System.out.println("Conta Corrente aberta");
                System.out.printf("Informacões: Agência %d, Conta: %d, Saldo %.2f\n", conta.getAgencia(), conta.getNumeroConta(), conta.getSaldo());
                System.out.println("");

            } else if (escConta.equalsIgnoreCase("CP")) {
                conta = new ContaPoupanca(0, 0, 0);
                conta.setCliente(cliente);
                System.out.println("Conta Poupanca aberta");
                System.out.printf("Informacões: Agência %d, Conta: %d, Saldo %.2f\n", conta.getAgencia(), conta.getNumeroConta(), conta.getSaldo());
                System.out.println("");

            } else {
                System.out.println("Escolha Inválida");
            }

        } else if (palavra.equalsIgnoreCase("N")) {
            System.out.println("Encerrando Sistema...");
            System.exit(0);
        } else {
            System.out.println("Opcão escolhida inválida.");
        }

        int escolha = -1;
        while (escolha != 0) {
            System.out.println("Escolha a opcão do seu banco");
            System.out.println("1 - Mostrar informacões. ");
            System.out.println("2 - Depositar Saldo");
            System.out.println("3 - Sacar Saldo");
            System.out.println("4 - Transferencia entre contas");
            System.out.println("0 - Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> conta.imprimirExtrato();
                case 2 -> conta.depositar();
                case 3 -> conta.sacar();
                case 4 -> conta.transferencia();
                case 0 -> {
                    System.out.println("Fechando o banco.");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Opcão Inválida");
                }
            }
        }
        scanner.close();
    }

}
