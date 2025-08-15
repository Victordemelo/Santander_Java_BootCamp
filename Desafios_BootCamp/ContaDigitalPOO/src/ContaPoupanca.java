public class ContaPoupanca extends BancoConta {

    public ContaPoupanca(int agencia, int numeroConta, double saldo) {
        super(agencia, numeroConta, saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("====== Extrato Conta Poupanca ======");
        super.informacoesCliente();
        System.out.println("");
    }
}
