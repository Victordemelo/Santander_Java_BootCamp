package exercicio03;

public class RelogioAmericano extends Relogio {

    @Override
    public void conversorHora(Relogio outroRelogio) {

        setHora(outroRelogio.getHora());
        setMinuto(outroRelogio.getMinuto());
        setSegundo(outroRelogio.getSegundo());

        int hora24 = getHora();
        int minuto = getMinuto();
        int segundo = getSegundo();

        String periodo;
        int hora12;

        if (hora24 == 0) {
            hora12 = 12;
            periodo = "AM";
        } else if (hora24 < 12) {
            hora12 = hora24;
            periodo = "AM";
        } else if (hora24 == 12) {
            hora12 = 12;
            periodo = "PM";
        } else {
            hora12 = hora24 - 12;
            periodo = "PM";
        }

        String horaFormatada = String.format("%02d:%02d:%02d %s", hora12, minuto, segundo, periodo);
        System.out.println("Horário americano: " + horaFormatada);
    }
}
