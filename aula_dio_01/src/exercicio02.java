/*
Escreva um código que receba o tamanho de um lado de um quadrado, e calcule a sua área e exiba na tela.
*/

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float lado1, calc_area;

        System.out.println("Digite o tamanho de um lado do quadrado: ");
        lado1 = scanner.nextFloat();

        calc_area = lado1 * lado1;
        System.out.printf("A área do quadrado é %s m².", calc_area);

        scanner.close();
    }
}
