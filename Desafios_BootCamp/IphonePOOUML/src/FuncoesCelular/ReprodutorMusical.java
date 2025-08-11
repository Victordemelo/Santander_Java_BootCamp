package FuncoesCelular;
public final class ReprodutorMusical {

    // Atributos
    private boolean tocandoMusica;
    private String musicalAtual;

    // Getters and Setters
    public boolean isTocandoMusica() {
        return tocandoMusica;
    }

    public void setTocandoMusica(boolean tocandoMusica) {
        this.tocandoMusica = tocandoMusica;
    }

    public String getMusicalAtual() {
        return musicalAtual;
    }

    public void setMusicalAtual(String musicalAtual) {
        this.musicalAtual = musicalAtual;
    }

    // Métodos
    public void selecionarMusica(String musica) {
        this.musicalAtual = musica;
        System.out.printf("Musica %s selecionada.\n", musicalAtual);
    }

    public void tocar() {
        if (musicalAtual == null) {
            System.out.println("Nenhuma música selecionada");
        } else if (!tocandoMusica) {
            tocandoMusica = true;
            System.out.println("Tocando a Música: " + musicalAtual);
        } else {
            System.out.println("Já está tocando: " + musicalAtual);
        }
    }

    public void pausar() {
        if (tocandoMusica) {
            tocandoMusica = false;
            System.out.printf("Musica %s pausada.\n", musicalAtual);
        } else {
            System.out.println("Não tem nenhuma música rodando.");
        }
    }

}
