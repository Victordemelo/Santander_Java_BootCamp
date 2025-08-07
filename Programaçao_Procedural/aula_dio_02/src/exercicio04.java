/*
Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, 
a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 
na divisão, números menores que o primeiro número devem ser ignorados.
*/

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base, n_escolhido;

        System.out.println("Digite o número principal para servir de base: ");
        base = scanner.nextInt();
        System.out.println("Agora informe um número para dividir pela base: ");
        n_escolhido = scanner.nextInt();

        while (n_escolhido <= base) {
            System.out.println("Você não pode escolher um número menor ou igual a base.");
            System.out.println("Digite outro:");
            n_escolhido = scanner.nextInt();

        }

        while (n_escolhido % base == 0) {
            System.out.println("Digite novamente outro número: ");
            n_escolhido = scanner.nextInt();

            while (n_escolhido <= base) {
                System.out.println("Você não pode escolher um número menor ou igual a base.");
                System.out.println("Digite outro:");
                n_escolhido = scanner.nextInt();
            }
        }

        System.out.println("Parabéns você descobriu o segredo.");
        scanner.close();
    }
}
