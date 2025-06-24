/*
Escreva um código que receba o nome e o ano de nascimento de alguem e imprima na tela a seguinte mensagem: 
"Olá Fulano você tem X anos."
*/

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite o seu nome completo: ");
        nome = scanner.nextLine();
        System.out.println("Digite a sua idade: ");
        idade = scanner.nextInt();

        System.out.printf("Olá %s, você tem %s anos de idade.", nome, idade);

        scanner.close();
    }
}
