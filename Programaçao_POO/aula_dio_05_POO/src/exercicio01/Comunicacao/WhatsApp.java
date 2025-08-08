package exercicio01.Comunicacao;

import exercicio01.Marketing;

public class WhatsApp implements Marketing{

    @Override
    public void getMensagem(String mensagem) {
        System.out.println("Mandando mensagem pelo WhatsApp: " + mensagem);
    }
    
}
