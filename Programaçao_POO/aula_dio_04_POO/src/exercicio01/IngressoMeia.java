package exercicio01;

public class IngressoMeia extends Ingresso {

    public IngressoMeia(double valor, String nomeFilme, String dubladoOuLegendados) {
        super(valor, nomeFilme, dubladoOuLegendados);
        
    }

    @Override
    public void valorReal(){
        System.out.println("O valor Real do ingresso é: " + this.valor);

    }

    @Override
    public void valorFilme() {
        System.out.printf("Com desconto de meia, o valor do ingresso fica R$ %.2f\n", this.valor / 2);
    }

    @Override
    public void assistirFilme() {
        System.out.printf("O filme que temos dísponivel é: %s\n", this.nomeFilme );
        
    }

    @Override
    public void escolhaModo() {
        System.out.printf("O filme será mostrado %s\n", this.dubladoOuLegendados);
        System.out.println("");
        
    }

    
    

    

    
}
