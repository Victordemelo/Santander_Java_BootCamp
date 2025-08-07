package exercicio03;

public class RelogioBrasileiro extends Relogio {

    @Override
    public void conversorHora(Relogio outroRelogio) {
        setHora(outroRelogio.getHora());
        setMinuto(outroRelogio.getMinuto());
        setSegundo(outroRelogio.getSegundo());

        horario();
    }
}
