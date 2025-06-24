/*
Escreva um código que receba o nome e o ano de nascimento de alguem e imprima na tela a seguinte mensagem: 
"Olá Fulano você tem X anos."
*/

import java.time.OffsetDateTime;
import java.util.Scanner;

public class exercicio01 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int nasc, idade;

        int base_ano = OffsetDateTime.now().getYear();

        System.out.println("Digite o seu nome completo: ");
        nome = scanner.nextLine();
        System.out.println("Digite a data de nascimento: ");
        nasc = scanner.nextInt();

        idade = base_ano - nasc;

        System.out.printf("Olá %s, você nasceu em %s e tem %s anos de idade.", nome, nasc, idade);

        scanner.close();
    }
}
