public class Cliente {

    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 3) {
            this.nome = nome;
        } else {
            System.out.println("Nome Inválido.");
            System.exit(0);
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 18 && idade <= 100) {
            this.idade = idade;
        } else {
            System.out.println("Você não tem a idade nescessária.");
            System.exit(0);
        }
    }
}
