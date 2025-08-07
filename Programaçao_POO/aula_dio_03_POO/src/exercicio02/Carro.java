package exercicio02;

public class Carro {

    private boolean ligadoOuDesligado;
    private int velocidade;
    private int marcha;

    public Carro(boolean ligadoOuDesligado, int velocidade, int marcha) {
        this.ligadoOuDesligado = false;
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    public void ligar() {
        if (!ligadoOuDesligado) {
            System.out.println("Ligando o carro...");
            this.ligadoOuDesligado = true;
        } else {
            System.out.println("O Carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligadoOuDesligado && velocidade == 0 && marcha == 0) {
            System.out.println("Desligando o carro...");
            ligadoOuDesligado = false;
        } else if(ligadoOuDesligado == true && velocidade > 0){
            System.out.println("Você não pode desligar o carro andando.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public boolean dentroDoLimiteAcelerar(int novaVelocidade) {
        if (marcha == 1)
            return novaVelocidade >= 0 && novaVelocidade <= 20;
        else if (marcha == 2)
            return novaVelocidade >= 21 && novaVelocidade <= 40;
        else if (marcha == 3)
            return novaVelocidade >= 41 && novaVelocidade <= 60;
        else if (marcha == 4)
            return novaVelocidade >= 61 && novaVelocidade <= 80;
        else if (marcha == 5)
            return novaVelocidade >= 81 && novaVelocidade <= 100;
        else if (marcha == 6)
            return novaVelocidade >= 101 && novaVelocidade <= 120;
        else
            return false;
    }

    public void acelerar() {
        if (!ligadoOuDesligado) {
            System.out.println("O carro está desligado.");
        } else if (dentroDoLimiteAcelerar(velocidade + 1)) {
            velocidade++;
            System.out.println("Acelerando... Velocidade atual: " + velocidade);
        } else {
            System.out.println("Velocidade não permitida para a marcha atual.");
        }
    }

    public void reduzir() {
        int novaVelocidade = velocidade - 1;
        if (novaVelocidade < 0) {
            System.out.println("O carro já está parado.");
        } else if (dentroDoLimiteAcelerar(novaVelocidade)) {
            velocidade--;
            System.out.println("Reduzindo... Velocidade atual: " + velocidade);
        } else {
            System.out.println("Velocidade não permitida para a marcha atual.");
        }
    }

    public boolean verificarMarcha(int novaMarcha) {
        return novaMarcha == marcha + 1 || novaMarcha == marcha - 1;
    }

    public boolean velocidadeCompatívelComMarcha(int marcha, int velocidade) {
        switch (marcha) {
            case 0:
                return velocidade == 0;
            case 1:
                return velocidade >= 0 && velocidade <= 20;
            case 2:
                return velocidade >= 20 && velocidade <= 40;
            case 3:
                return velocidade >= 40 && velocidade <= 60;
            case 4:
                return velocidade >= 60 && velocidade <= 80;
            case 5:
                return velocidade >= 80 && velocidade <= 100;
            case 6:
                return velocidade >= 100 && velocidade <= 120;
            default:
                return false;
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligadoOuDesligado) {
            System.out.println("Não é possível trocar marcha com o carro desligado.");
            return;
        }

        if (!verificarMarcha(novaMarcha)) {
            System.out.println("Você não pode pular marchas.");
            return;
        }

        if (!velocidadeCompatívelComMarcha(novaMarcha, velocidade)) {
            System.out.println("Velocidade incompatível com a nova marcha.");
            return;
        }

        marcha = novaMarcha;
        System.out.println("Marcha trocada para: " + marcha);
    }

    public boolean dentroDoLimiteVolante() {
        return ligadoOuDesligado && (velocidade >= 1 && velocidade <= 40);
    }

    public void virarVolante(String direcao) {
        if (!dentroDoLimiteVolante()) {
            System.out.println("Você só pode virar se o carro estiver ligado e a velocidade entre 1 km/h a 40 km/h.");
            return;
        }

        if (direcao.equalsIgnoreCase("esquerda")) {
            System.out.println("Virando o carro para a esquerda... ");
        } else if (direcao.equalsIgnoreCase("direita")) {
            System.out.println("Virando o carro para a direita... ");
        } else {
            System.out.println("Opção digitada inválida. ");
        }
    }

    public void verificarVelocidade() {
        System.out.printf("A velocidade atual do veículo é: %s Km/h\n", velocidade);
    }
}
