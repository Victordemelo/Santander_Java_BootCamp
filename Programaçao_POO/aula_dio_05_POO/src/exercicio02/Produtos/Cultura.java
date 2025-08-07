package exercicio02.Produtos;

import exercicio02.Tributos;

public record Cultura(double saldo) implements Tributos {

    @Override
    public double getImpostos() {
        return saldo + (saldo * 0.04);
    }
}
