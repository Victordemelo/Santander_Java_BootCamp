import FuncoesCelular.ChamadaCelular;
import FuncoesCelular.NavegadorInternet;
import FuncoesCelular.ReprodutorMusical;

public class Iphone implements Celular {
    // Atributos / Instancias
    private ReprodutorMusical reprodutor;
    private ChamadaCelular chamada;
    private NavegadorInternet navegador;

    // Constructor do Iphone
    public Iphone() {
        this.reprodutor = new ReprodutorMusical();
        this.chamada = new ChamadaCelular();
        this.navegador = new NavegadorInternet();
    }

    // Métodos
    @Override
    public void tocar() {
        reprodutor.tocar();
    }

    @Override
    public void pausar() {
        reprodutor.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        reprodutor.selecionarMusica(musica);
    }

    @Override
    public void ligar(String numero) {
        chamada.ligar(numero);
    }

    @Override
    public void desligar() {
        chamada.desligar();
    }

    @Override
    public void atender() {
        chamada.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        chamada.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina() {
        navegador.exibirPagina();
    }

    @Override
    public void adicionarNovaAba(int numAbas) {
        navegador.adicionarNovaAba(numAbas);
    }

    @Override
    public void atualizarPagina() {
        navegador.atualizarPagina();
    }
}
