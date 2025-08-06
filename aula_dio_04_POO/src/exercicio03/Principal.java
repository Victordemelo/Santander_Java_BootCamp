package exercicio03;

public class Principal {
    public static void main(String[] args) {

        RelogioBrasileiro relogioBR = new RelogioBrasileiro();
        relogioBR.setHora(22);
        relogioBR.setMinuto(15);
        relogioBR.setSegundo(0);

        RelogioAmericano relogioUS = new RelogioAmericano();

        System.out.println("Relógio Brasileiro:");
        relogioBR.conversorHora(relogioBR);

        System.out.println();

        System.out.println("Relógio Americano:");
        relogioUS.conversorHora(relogioBR);
    }
}
