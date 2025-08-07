import java.util.Scanner;

public class codigos_testes {
    public static void main(String[] args) {

        String nome;
        boolean confirmacao;
        int idade;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome = scanner.nextLine();
        System.out.println("Digite a sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Olá " + nome + " sua idade é " + idade + "?");

        System.out.println("True or False");
        confirmacao = scanner.nextBoolean();

        if (confirmacao == true) {
            System.out.println("Parabéns, você foi aprovado no teste.");
        } else {
            System.err.println("Uma pena, não foi dessa vez.");
        }
        scanner.close();
    }
}
