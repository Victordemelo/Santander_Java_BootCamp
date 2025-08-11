package FuncoesCelular;

public class NavegadorInternet {

    // Atributos
    private String pagina;
    private int abaNova;

    // Getters and Setters
    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;

    }

    public int getAbaNova() {
        return abaNova;
    }

    public void setAbaNova(int abaNova) {
        this.abaNova = abaNova;
    }

    // Métodos
    public void exibirPagina() {
        System.out.println("Exibindo Pagina na internet.");
    }

    public void adicionarNovaAba(int abaNova) {
        this.abaNova = this.abaNova + 1;
        System.out.printf("Quantidades de abas abertas: %d", this.abaNova);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

}
