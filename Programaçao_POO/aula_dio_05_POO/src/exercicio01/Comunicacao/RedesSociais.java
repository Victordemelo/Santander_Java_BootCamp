package exercicio01.Comunicacao;

import exercicio01.Marketing;

public class RedesSociais implements Marketing{

    @Override
    public void getMensagem(String mensagem) {
        System.out.println("Mandando mensagem pela Rede Social: " + mensagem);
    }
    
}
