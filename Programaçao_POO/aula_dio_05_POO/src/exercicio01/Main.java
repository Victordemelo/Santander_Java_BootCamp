package exercicio01;

import java.util.Scanner;

import exercicio01.Comunicacao.Email;
import exercicio01.Comunicacao.RedesSociais;
import exercicio01.Comunicacao.Sms;
import exercicio01.Comunicacao.WhatsApp;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Marketing marketing = null;
        String mensagemPrincipal = "Promoção imperdível: compre 1 e leve 2!";
        int option = -1;

        while (option != 0) {

            System.out.println("Escolha aonde iremos mandar a mensagem.");
            System.out.println("1 - SMS");
            System.out.println("2 - Email");
            System.out.println("3 - Redes Sociais");
            System.out.println("4 - WhatsApp");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            if (option == 1) {
                marketing = mandarSms();
                marketing.getMensagem(mensagemPrincipal);
                
            } else if (option == 2) {
                marketing = mandarEmail();
                marketing.getMensagem(mensagemPrincipal);
                
            } else if (option == 3) {
                marketing = mandarRedeSocial();
                marketing.getMensagem(mensagemPrincipal);
                
            } else if (option == 4) {
                marketing = mandarWhatsApp();
                marketing.getMensagem(mensagemPrincipal);

            } else if (option == 0) {
                System.out.println("Saindo do sistema...");
                break;

            } else {
                System.out.println("Opção Inválida.");
                continue;
            }

        }
        scanner.close();
    }

    private static Marketing mandarSms() {
        return new Sms();
    }
    private static Marketing mandarEmail() {
        return new Email();
    }
    private static Marketing mandarRedeSocial() {
        return new RedesSociais();
    }
    private static Marketing mandarWhatsApp() {
        return new WhatsApp();
    }
}
