// Escreva um código onde o usuário entra com um número e seja gerado a tabuada de 1 até 10 desse número.

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, resultado;
        int i = 0;

        System.out.printf("Digite um número de 1 até 10 para obter a tabuada do mesmo: ");
        numero = scanner.nextInt();

        for (i = 1; i <= 10; i++) {
            resultado = i * numero;
            System.out.printf("A tabuada de %s x %s É igual a %s\n", numero, i, resultado);
        }

        scanner.close();
    }
}