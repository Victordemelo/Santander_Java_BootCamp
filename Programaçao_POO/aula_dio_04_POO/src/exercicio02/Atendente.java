package exercicio02;

public final class Atendente extends Usuario {

    // Atributos
    protected double valorCaixa;
    protected double cofre;

    // Constructor
    public Atendente(String nome, String email, String senha, boolean admin, double valorCaixa) {
        super(nome, email, senha, false);

    }

    // Getter and Setter
    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    public double getCofre() {
        return cofre;
    }

    public void setCofre(double cofre) {
        this.cofre = cofre;
    }

    // Métodos especiais
    public void receberPagamento(Vendedor vendedor) {
        if (isLoginUsuario()) {
            if (vendedor.getVendasEmEspera() >= 1) {
                double calcVendas = vendedor.getVendasEmEspera() * 300;
                System.out.println("Compra passando no caixa...");
                vendedor.quantidadeVendas = vendedor.vendasEmEspera;
                vendedor.vendasEmEspera = 0;
                this.valorCaixa = calcVendas;

            } else {
                System.out.println("Nenhuma venda realizada até agora.");
            }
        } else {
            System.out.println("Você só pode utilizar o caixa, se estiver logado.");
        }

    }

    public void fecharCaixa() {
        System.out.println("Fechando o caixa...");
        System.out.println("Todo o saldo será transferido para o cofre");
        this.cofre = this.valorCaixa;
        this.valorCaixa = 0;
        this.realizarLogoff();
    }
}
