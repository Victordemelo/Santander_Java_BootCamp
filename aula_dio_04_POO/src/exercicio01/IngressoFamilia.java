package exercicio01;

public class IngressoFamilia extends Ingresso {

    private int pessoasFamilia;

    public int getPessoasFamilia() {
        return pessoasFamilia;
    }

    public void setPessoasFamilia(int pessoasFamilia) {
        this.pessoasFamilia = pessoasFamilia;
    }

    public IngressoFamilia(double valor, String nomeFilme, String dubladoOuLegendados) {
        super(valor, nomeFilme, dubladoOuLegendados);

    }

    @Override
    public void valorReal() {
        System.out.printf("O valor Real do ingresso é: %.2f\n", (getValor() * getPessoasFamilia()));

    }

    @Override
    public void valorFilme() {
        if (pessoasFamilia > 3) {
            System.out.println("Voces ganharam um desconto de 5%");
            System.out.printf("O valor do filme ficou: %.2f\n", (getValor() * getPessoasFamilia()) - ((getValor() * getPessoasFamilia()) * 0.05));
        } else {
            System.out.printf("O valor do filme ficou: %.2f\n", (getValor() * getPessoasFamilia()));
        }

    }

    @Override
    public void assistirFilme() {
        System.out.printf("O filme que temos dísponivel é: %s\n", this.nomeFilme);

    }

    @Override
    public void escolhaModo() {
        System.out.printf("O filme será mostrado %s\n", this.dubladoOuLegendados);
        System.out.println("");

    }

}
