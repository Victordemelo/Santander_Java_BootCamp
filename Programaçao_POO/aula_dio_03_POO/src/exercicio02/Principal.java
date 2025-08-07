package exercicio02;

import java.util.Scanner;

class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carro simuladorCarro = new Carro(false, 0, 0);
        int escolha = -1;

        System.out.println("=====================================");
        System.out.println("Seja Bem vindo ao simulador de carro!");
        System.out.println("Selecione uma das opções para iniciar");
        System.out.println("=====================================");

        do {
            System.out.println("");
            System.out.println("1 - Ligar o Carro");
            System.out.println("2 - Desligar o Carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Reduzir");
            System.out.println("5 - Virar para Esquerda ou Direita");
            System.out.println("6 - Verificar velocidade");
            System.out.println("7 - Trocar Marcha");
            System.out.println("0 - Sair");
            escolha = scanner.nextInt();
            System.out.println("");

            switch (escolha) {
                case 1: {
                    simuladorCarro.ligar();
                }
                    break;
                case 2: {
                    simuladorCarro.desligar();
                }
                    break;
                case 3: {
                    simuladorCarro.acelerar();
                }
                    break;
                case 4: {
                    simuladorCarro.reduzir();
                }
                    break;
                case 5: {
                    System.out.println("Para qual lado você deseja virar? (esquerda/direita)");
                    String direcao = scanner.next();
                    simuladorCarro.virarVolante(direcao);
                }
                    break;
                case 6: {
                    simuladorCarro.verificarVelocidade();
                }
                    break;
                case 7: {
                    System.out.println("Digite a marcha desejada (0 a 6):");
                    int novaMarcha = scanner.nextInt();
                    simuladorCarro.trocarMarcha(novaMarcha);
                }
                    break;
                case 0: {
                    System.out.println("Encerrando Sistema...");
                    System.exit(0);
                }
                    break;

                default: {
                    System.out.println("Opção Digitada Inválida!");
                }
                    break;
            }

        } while (escolha != 0);

        scanner.close();
    }
}