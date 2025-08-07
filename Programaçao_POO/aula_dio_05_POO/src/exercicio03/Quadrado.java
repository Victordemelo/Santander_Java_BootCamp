package exercicio03;

public record Quadrado(double tamanho) implements FormaGeometrica {

    @Override
    public double getArea() {
        return tamanho * tamanho;
    }
}
