/*
Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe 
entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares 
(de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados 
e em ordem decrescente;
*/

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2;
        String n_escolhido;

        System.out.printf("Digite o primeiro Número inteiro: ");
        n1 = scanner.nextInt();
        System.out.printf("Digite um número maior que o número %s: ", n1);
        n2 = scanner.nextInt();
        if (n2 <= n1) {
            System.out.println("Você digitou um número menor que N1.");
            scanner.close();
            return;
        } else {
            System.out.println("Você vai querer mostrar os números PAR ou IMPAR? ");
        }

        scanner.nextLine();
        n_escolhido = scanner.nextLine();

        if (n_escolhido.equalsIgnoreCase("par")) {
            System.out.println("Você escolheu PAR");
            System.out.println("Os numeros PARES são os seguintes: ");

        } else if (n_escolhido.equalsIgnoreCase("impar")) {
            System.out.println("Você escolheu IMPAR");
            System.out.println("Os numeros IMPARES são os seguintes: ");

        } else {
            System.out.println("Opção inválida.");
        }

        for (int i = n2; i >= n1; i--) {
            if (n_escolhido.equalsIgnoreCase("PAR") && i % 2 == 0) {
                System.out.println(i);
            } else if (n_escolhido.equalsIgnoreCase("IMPAR") && i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
