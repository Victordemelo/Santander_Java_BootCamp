import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int escolha = -1;

        while (escolha != 0) {
            System.out.println("Digite a opcao desejada:");
            System.out.println("1 - Reprodução Musical");
            System.out.println("2 - Chamada Telefonica");
            System.out.println("3 - Navegar na Web");
            System.out.println("0 - Sair ");
            escolha = scanner.nextInt();
            System.out.println("");

            switch (escolha) {
                case 1:
                    int escReprodutor = -1;
                    while (escReprodutor != 0) {
                        System.out.println("Escolha a opção do reprodutor musical:");
                        System.out.println("1 - Selecionar Músicas ");
                        System.out.println("2 - Tocar Música ");
                        System.out.println("3 - Pausar Música ");
                        System.out.println("0 - Voltar");

                        escReprodutor = scanner.nextInt();

                        switch (escReprodutor) {
                            case 1:
                                iphone.selecionarMusica("Jazz Gospel");
                                break;
                            case 2:
                                iphone.tocar();
                                break;
                            case 3:
                                iphone.pausar();
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int escChamada = -1;
                    while (escChamada != 0) {
                        System.out.println("Escolha a opção da Ligação:");
                        System.out.println("1 - Ligar para alguém");
                        System.out.println("2 - Desligar chamada");
                        System.out.println("3 - Atender Ligação");
                        System.out.println("4 - Iniciar Correio de Voz");
                        System.out.println("0 - Voltar");

                        escChamada = scanner.nextInt();

                        switch (escChamada) {
                            case 1:
                                iphone.ligar("(48) 98807-8029");
                                break;
                            case 2:
                                iphone.desligar();
                                break;
                            case 3:
                                iphone.atender();
                                break;
                            case 4:
                                iphone.iniciarCorreioVoz();
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int escNavegacao = -1;
                    while (escNavegacao != 0) {
                        System.out.println("Escolha a opção que deseja para navegar na Web");
                        System.out.println("1 - Exibir Página ");
                        System.out.println("2 - Atualizar Página");
                        System.out.println("3 - Adicionar nova Aba");
                        System.out.println("0 - Voltar");

                        escNavegacao = scanner.nextInt();

                        switch (escNavegacao) {
                            case 1:
                                iphone.exibirPagina();
                                break;
                            case 2:
                                iphone.atualizarPagina();
                                break;
                            case 3:
                                iphone.adicionarNovaAba(0);

                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Fechando o Sistema...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção selecionada inválida.");
                    break;
            }
        }
        scanner.close();
    }
}
