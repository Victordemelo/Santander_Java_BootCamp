package exercicio01;

public class Banco {

    private double saldoTotal;
    private double saldo;
    private double cheque;
    private double primeiroDeposito;

    // Constructor
    public Banco(double saldoInicial, double cheque, double primeiroDeposito, double saldoTotal) {
        this.saldoTotal = saldoTotal;
        this.saldo = saldoInicial;
        this.cheque = cheque;
        this.primeiroDeposito = primeiroDeposito;
    }

    public double getPrimeiroDeposito() {
        return primeiroDeposito;
    }

    public void setPrimeiroDeposito(double primeiroDeposito) {
        if (primeiroDeposito <= 500.00) {
            this.saldo = primeiroDeposito;
            this.cheque = 50.00;
        } else {
            this.saldo = primeiroDeposito;
            this.cheque = primeiroDeposito / 2;
        }

    }

    // Setter (Ele seta o valor.)
    public void depositarSaldo(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.", valorDeposito);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void retirarSaldo(double valorSaque) {
        double limiteDisponivel = saldo + cheque;

        if (valorSaque <= limiteDisponivel) {
            this.saldo -= valorSaque;

            if (this.saldo < 0) {
                double valorUsadoCheque = Math.abs(this.saldo);
                double taxa = valorUsadoCheque * 0.20;
                this.saldo -= taxa;
                System.out.printf(
                        "Saque de R$ %.2f realizado com sucesso. Foi cobrada uma taxa de R$ %.2f por uso do cheque especial.%n",
                        valorSaque, taxa);
            } else {
                System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valorSaque);
            }
        } else {
            System.out.println("Você não pode realizar o saque. Limite insuficiente.");
        }
    }

    public void verificarCheque() {
        if (this.saldo < 0) {
            System.out.println(
                    "Você está utilizando o Cheque especial, será cobrado uma taxa de 20% do valor utilizado.");
        } else {
            System.out.println("Não está utilizando o cheque especial.");
        }
    }

    public void pagarBoleto(double valorBoleto){
        double limiteDisponivel = saldo + cheque;
        if(limiteDisponivel >= valorBoleto){
            this.saldo -= valorBoleto;
            this.saldoTotal -= valorBoleto;
            System.out.println("Boleto pago com sucesso.");
        } else {
            System.out.println("Dinheiro insuficiente para pagar o boleto.");
        }
    }

    // Getter (Ele lê o valor)
    public double getCheque() {
        return cheque;
    }

    public double getSaldo() {
        return saldo;
    }

    public double saldoTotal() {
        saldoTotal = saldo + cheque;
        return saldoTotal;
    }

}