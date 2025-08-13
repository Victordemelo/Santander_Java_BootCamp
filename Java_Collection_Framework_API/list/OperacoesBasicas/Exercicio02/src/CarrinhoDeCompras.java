import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.carrinhoCompras.add(item);
    }

    public void removerItem(String nome) {
        List<Item> removerItemLista = new ArrayList<>();
        if (!carrinhoCompras.isEmpty()) {
            for (Item i : carrinhoCompras) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    removerItemLista.add(i);
                }
            }
            carrinhoCompras.removeAll(removerItemLista);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!carrinhoCompras.isEmpty()) {
            for (Item item : carrinhoCompras) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public void exibirItens() {
        System.out.println(this.carrinhoCompras);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + carrinhoCompras +
                '}';
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
