package FuncoesCelular;

public class ChamadaCelular {

    // Atributos
    private String numero;
    private boolean ligacao;
    private boolean chamando;

    // Getters and Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isLigacao() {
        return ligacao;
    }

    public void setLigacao(boolean ligacao) {
        this.ligacao = ligacao;
    }

    public boolean isChamando() {
        return chamando;
    }

    public void setChamando(boolean chamando) {
        this.chamando = chamando;
    }

    // Métodos
    public void ligar(String numeroChamado) {
        this.numero = numeroChamado;
        if (numero == null) {
            System.out.println("Nenhum número digitado.");
        } else if (!ligacao) {
            this.ligacao = true;
            System.out.println("Realizando ligação para o numero " + numero);
        } else {
            System.out.println("Uma ligação já está em andamento.");
        }
    }

    public void desligar() {
        if (ligacao) {
            System.out.println("Desligando chamada.");
            this.ligacao = false;
        } else {
            System.out.println("Nenhum número na linha.");
        }

    }

    public void atender() {
        if (!ligacao) {
            this.ligacao = true;
            System.out.println("Atendendo chamada.");
        } else {
            System.out.println("Você ja está com uma ligação na linha.");
        }
    }

    public void iniciarCorreioVoz() {
        if (ligacao) {
            System.out.println("Tem um ligação em andamento, você não pode ouvir o correio de voz agora.");
        } else {
            System.out.println("Tocando Correio de Voz...");
        }
    }
}