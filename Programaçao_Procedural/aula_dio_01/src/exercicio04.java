/*
Escreva um código que receba o nome e a idade de 2 pessoas, e imprima a diferença de idade entre elas.
*/

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2, diferenca_idade;

        System.out.println("Digite o nome e idade da Primeira pessoa");
        System.out.printf("Nome: ");
        nome1 = scanner.nextLine();
        System.out.printf("Idade: ");
        idade1 = scanner.nextInt();

        scanner.nextLine(); // Para quebrar a linha.

        System.out.println("Digite o nome e idade da Segunda pessoa");
        System.out.printf("Nome: ");
        nome2 = scanner.nextLine();
        System.out.printf("Idade: ");
        idade2 = scanner.nextInt();

        diferenca_idade = idade1 - idade2;

        System.out.printf("A diferença de idade entre %s e %s, é de %s anos.", nome1, nome2, Math.abs(diferenca_idade));
        scanner.close();
    }
}
