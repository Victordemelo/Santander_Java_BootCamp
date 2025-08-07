import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite o primeiro parâmetro: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o Segundo parâmetro: ");
        numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 >= numero2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contador = numero2 - numero1;

            for (int i = 1; i <= contador; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
