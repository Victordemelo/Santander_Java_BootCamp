//O Objetivo principal é poder criar uma conta bancária atrávés do terminal.

//Importando a biblioteca.
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Iniciando o Scanner para ler os números.
        Scanner scanner = new Scanner(System.in);

        // Iniciando as variáveis
        String nome, agencia;
        int numeroConta;
        double saldo;

        // Iniciando a interface do banco.
        System.out.println("------------------------");
        System.out.println("Seja Bem-vindo ao Banco");
        System.out.println("------------------------\n");
        System.out.println(
                "Para criar sua conta iremos precisar de alguns dados seus...\nComo seu nome, o numero da conta, agência e o saldo disponível.\n");
        System.out.printf("Digite o seu nome: ");
        nome = scanner.nextLine();
        System.out.printf("Digite a sua Agência (Ex 123-0): ");
        agencia = scanner.nextLine();
        System.out.printf("Digite o número da conta (Ex 1234): ");
        numeroConta = scanner.nextInt();
        System.out.printf("Digite o saldo para depositar: ");
        saldo = scanner.nextDouble();

        // Mostrando o resultado para o usuário.
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque.",
                nome, agencia, numeroConta, saldo);

        scanner.close();
    }
}