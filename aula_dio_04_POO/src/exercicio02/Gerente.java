package exercicio02;

public final class Gerente extends Usuario {

    // Constructor
    public Gerente(String nome, String email, String senha, boolean admin) {
        super(nome, email, senha, true);

    }

    // Métodos especiais
    public void relatorioFinanceiro(Vendedor vendedor, Atendente atendente) {
        if (isLoginUsuario()) {
            System.out.printf("Clientes esperando passar no caixa: %s\n", vendedor.getVendasEmEspera());
            System.out.printf("O número total de vendas no dia foi de: %s\n", vendedor.getQuantidadeVendas());
            System.out.printf("O valor do caixa, atualmente é de: R$ %.2f\n", atendente.getValorCaixa());
            System.out.printf("O valor que possuimos no cofre é %.2f\n", atendente.getCofre());
        } else {
            System.out.println("Você só pode gerar o relatório logado em sua conta.");
        }

    }

    public void consultarVendas(Vendedor vendedor) {
        if (isLoginUsuario()) {
            System.out.printf("Clientes esperando passar no caixa: %s\n", vendedor.getVendasEmEspera());
            System.out.printf("O número total de vendas no dia foi de: %s\n", vendedor.getQuantidadeVendas());
        } else {
            System.out.println("Você só pode gerar o relatório logado em sua conta.");
        }
    }
}