package exercicio01.Comunicacao;

import exercicio01.Marketing;

public class Email implements Marketing{

    @Override
    public void getMensagem(String mensagem) {
        System.out.println("Mandando mensagem pelo Email: " + mensagem);
    }
    
}
