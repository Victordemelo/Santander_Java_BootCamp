public class ContaCorrente extends BancoConta {

    public ContaCorrente(int agencia, int numeroConta, double saldo) {
        super(agencia, numeroConta, saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("====== Extrato Conta Corrente ======");
        super.informacoesCliente();
        System.out.println("");
    }
}
