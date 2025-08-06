package exercicio03;

public abstract class Relogio {

    // Atributos
    private int hora;
    private int minuto;
    private int segundo;

    // Getters and Setters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            this.hora = 23;
            System.out.println("A hora fornecida é errada");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            this.minuto = 59;
            System.out.println("O Minuto fornecido é errado");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            this.segundo = 59;
            System.out.println("O Segundo fornecido é errado");
        }
    }

    protected void horario() {
        String horaFormatada = String.format("%02d:%02d:%02d", hora, minuto, segundo);
        System.out.println("Horário atual: " + horaFormatada);
    }

    public abstract void conversorHora(Relogio outRelogio);

}
