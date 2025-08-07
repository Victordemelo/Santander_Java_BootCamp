package exercicio03;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = null;
        int option = -1;

        while (option != 0) {
            System.out.println("Escola a forma geométrica para calcular a área");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Circulo");
            System.out.println("0 - Sair do Programa");
            option = scanner.nextInt();

            if (option == 1) {
                formaGeometrica = criarQuadrado();

            } else if (option == 2) {
                formaGeometrica = criarRetangulo();

            } else if (option == 3) {
                formaGeometrica = criarCirculo();

            } else if (option == 0) {
                System.out.println("Saindo do sistema...");
                System.exit(0);
                break;

            } else {
                System.out.println("Opção Inválida.");
                continue;
            }

            System.out.println("O resultado do cálculo da área foi de " + formaGeometrica.getArea());
        }
    }

    private static FormaGeometrica criarQuadrado() {
        System.out.println("Informe os tamanhos dos lados: ");
        var tamanho = scanner.nextDouble();
        return new Quadrado(tamanho);
    }

    private static FormaGeometrica criarRetangulo() {
        System.out.println("Informe a base: ");
        var base = scanner.nextDouble();
        System.out.println("Informe a altura: ");
        var altura = scanner.nextDouble();
        return new Retangulo(base, altura);
    }

    private static FormaGeometrica criarCirculo() {
        System.out.println("Informe o raio: ");
        var raio = scanner.nextDouble();
        return new Circulo(raio);
    }
}
