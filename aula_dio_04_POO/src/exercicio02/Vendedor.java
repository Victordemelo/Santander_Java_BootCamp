package exercicio02;

public final class Vendedor extends Usuario {

    // Atributos
    protected int quantidadeVendas;
    protected int vendasEmEspera;

    // Constructor
    public Vendedor(String nome, String email, String senha, boolean admin, int quantidadeVendas) {
        super(nome, email, senha, false);

    }

    // Getter and Setter
    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public int getVendasEmEspera() {
        return vendasEmEspera;
    }

    public void setVendasEmEspera(int vendasEmEspera) {
        this.vendasEmEspera = vendasEmEspera;
    }

    // Métodos adicionais
    public void realizarVenda() {
        if (isLoginUsuario()) {
            System.out.println("Uma venda foi realizada.");
            this.vendasEmEspera = vendasEmEspera + 1;
        } else {
            System.out.println("Você precisa realizar o login na máquina para realizar a venda");
        }
    }

    public void consultarVendas() {
        if (isLoginUsuario()) {
            System.out.printf("Clientes esperando passar no caixa: %s\n", getVendasEmEspera());
            System.out.printf("O número total de vendas no dia foi de: %s\n", getQuantidadeVendas());
        } else {
            System.out.println("Você só pode gerar o relatório logado em sua conta.");
        }
    }
}
