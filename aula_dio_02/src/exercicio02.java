/* Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC
(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

Se for menor ou igual a 18,5 "Abaixo do peso";
se for entre 18,6 e 24,9 "Peso ideal";
Se for entre 25,0 e 29,9 "Levemente acima do peso";
Se for entre 30,0 e 34,9 "Obesidade Grau I";
Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
*/

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso, altura, IMC;

        System.out.println("Seja Bem-Vindo\nVamos calculular seu IMC?");
        System.out.printf("Digite o seu peso atual (ex 80,4): ");
        peso = scanner.nextDouble();
        System.out.printf("Digite a sua altura atual (ex 1,80): ");
        altura = scanner.nextDouble();

        IMC = peso / (altura * altura);

        if (IMC <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.6 && IMC <= 24.9) {
            System.out.println("Peso ideal");
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (IMC >= 30.0 && IMC <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (IMC >= 35.0 && IMC <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }

        scanner.close();
    }

}
