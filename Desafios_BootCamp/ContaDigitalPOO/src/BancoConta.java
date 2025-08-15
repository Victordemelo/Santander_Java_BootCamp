
import java.util.Random;
import java.util.Scanner;

public abstract class BancoConta {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int numeroAleatorio = random.nextInt(2000);

    // Atributos
    private final int agencia;
    private final int numeroConta;
    private double saldo;
    private Cliente cliente;

    // Constructor
    public BancoConta(int agencia, int numeroConta, double saldo) {
        this.agencia = 1570;
        this.numeroConta = numeroAleatorio;
        this.saldo = saldo;
    }

    // Getters and Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos
    public void depositar() {
        System.out.printf("Digite o valor para o depósito: ");
        double valorDeposito = scanner.nextDouble();
        this.saldo = saldo + valorDeposito;
    }

    public void sacar() {
        System.out.printf("Digite o valor para sacar: ");
        double valorSaque = scanner.nextDouble();
        if (this.saldo >= valorSaque) {
            this.saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Você não tem saldo suficiente");
        }
    }

    public void transferencia(){
        System.out.println("Digite a agencia e conta de destino: ");
        System.out.printf("Agência: ");
        int agencia = scanner.nextInt();
        System.out.printf("Numero da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.printf("Digite o valor da transferência: ");
        double valorSaque = scanner.nextDouble();
        if (this.saldo >= valorSaque) {
            this.saldo = saldo - valorSaque;
            System.out.printf("Transferencia realizada com sucesso para Agência: %d, Conta: %d\n", agencia, numeroConta);
        } else {
            System.out.println("Você não tem saldo suficiente");
        }
    }

    protected void informacoesCliente() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public abstract void imprimirExtrato();

}
