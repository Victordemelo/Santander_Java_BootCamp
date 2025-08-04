package exercicio01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IngressoMeia ingressoM = new IngressoMeia(20, "Matrix", "Legendado");
        IngressoFamilia ingressoF = new IngressoFamilia(30, "Procurando vitinho", "Dublado");

        int escolha = -1;
        System.out.println("==============================");
        System.out.println("Bem vindo ao cinema");
        System.out.println("escolha uma das opcoes abaixo");
        System.out.println("==============================");

        while (escolha != 0) {

            System.out.println("1 - Comprar Meia");
            System.out.println("2 - Comprar Inteira");
            System.out.println("0 - Sair");
            System.out.println("");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    ingressoM.valorReal();
                    ingressoM.valorFilme();
                    ingressoM.assistirFilme();
                    ingressoM.escolhaModo();
                    break;
                case 2:
                    System.out.println("Digite o numero total de pessoas: ");
                    int pessoasFamilia = scanner.nextInt();
                    ingressoF.setPessoasFamilia(pessoasFamilia);

                    ingressoF.valorReal();
                    ingressoF.valorFilme();
                    ingressoF.assistirFilme();
                    ingressoF.escolhaModo();
                    break;
                case 0:
                    System.out.println("Fechando o sistema...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Escolha inválida.");
                    break;
            }

        }
        scanner.close();
    }
}