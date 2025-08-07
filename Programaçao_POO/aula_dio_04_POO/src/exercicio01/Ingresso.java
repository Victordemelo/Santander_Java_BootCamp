package exercicio01;

public abstract class Ingresso {

    protected final double valor;
    protected String nomeFilme;
    protected String dubladoOuLegendados;

    public Ingresso(double valor, String nomeFilme, String dubladoOuLegendados) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dubladoOuLegendados = dubladoOuLegendados;
    }

    public double getValor() {
        return valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDubladoOuLegendados() {
        return dubladoOuLegendados;
    }

    public void setDubladoOuLegendados(String dubladoOuLegendados) {
        this.dubladoOuLegendados = dubladoOuLegendados;
    }

    public abstract void valorReal();

    public abstract void valorFilme();

    public abstract void assistirFilme();

    public abstract void escolhaModo();

}
