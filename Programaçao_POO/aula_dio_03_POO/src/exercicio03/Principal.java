package exercicio03;

import java.util.Scanner;

class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pet pet = new Pet();
        PetMachine petMachine = new PetMachine(0, 0, false, false);

        System.out.println("=========================");
        System.out.println("Seja bem vindo ao PetShop");
        System.out.println("=========================");

        int escolha = -1;
        while (escolha != 0) {
            System.out.println("");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1 - Abastecer tanque com água");
            System.out.println("2 - Abastecer tanque com shampoo");
            System.out.println("3 - Verificar quantidade de água");
            System.out.println("4 - Verificar quantidade de shampoo");
            System.out.println("5 - Colocar o Pet na máquina");
            System.out.println("6 - Retirar o Pet da máquina");
            System.out.println("7 - Dar banho no Pet");
            System.out.println("8 - Verificar se tem Pet no Banho");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");
            escolha = scanner.nextInt();
            System.out.println("");

            switch (escolha) {
                case 1:
                    petMachine.abastecerComAgua();
                    break;
                case 2:
                    petMachine.abastecerComShampoo();
                    break;
                case 3:
                    petMachine.verificarAgua();
                    break;
                case 4:
                    petMachine.verificarShampoo();
                    break;
                case 5:
                    if (petMachine.isMaquina() == true) {
                        petMachine.colocarPetNaMaquina();
                    } else {
                        System.out.println("Digite o nome do seu pet: ");
                        scanner.nextLine();
                        String nomedopet = scanner.nextLine();
                        System.out.println("");

                        pet.setNome(nomedopet);
                        petMachine.setPet(pet);
                        petMachine.colocarPetNaMaquina();
                    }
                    break;
                case 6:
                    petMachine.retirarPetDaMaquina();
                    break;
                case 7:
                    petMachine.darBanhoNoPet();
                    break;
                case 8:
                    petMachine.verificarSeTemPetNoBanho();
                    break;
                case 9:
                    petMachine.limparMaquina();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("");
                    System.out.println("Opção digitada inválida.");
                    break;
            }

        }

        scanner.close();
    }
}