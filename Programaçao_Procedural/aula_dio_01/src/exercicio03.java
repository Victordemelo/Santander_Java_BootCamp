/*
Escreva um código que receba a base e a altura de um retângulo, e calcule a sua área, e exiba na tela.
*/

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float base, altura, calc_area;

        System.out.println("Digite a base do retângulo: ");
        base = scanner.nextFloat();
        System.out.println("Digite a altura do retângulo: ");
        altura = scanner.nextFloat();

        calc_area = base * altura;
        System.out.printf("A área do retângulo é %s m².", calc_area);

        scanner.close();
    }
}
