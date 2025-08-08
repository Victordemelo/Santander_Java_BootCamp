package exercicio01.Comunicacao;

import exercicio01.Marketing;

public class Sms implements Marketing{

    @Override
    public void getMensagem(String mensagem) {
        System.out.println("Mandando mensagem pelo SMS: " + mensagem);
    }
    
}
