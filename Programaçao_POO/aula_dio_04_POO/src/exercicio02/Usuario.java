package exercicio02;

import java.util.Scanner;

public abstract class Usuario {

    Scanner scanner = new Scanner(System.in);

    // Atributos
    private String nome;
    private String email;
    private String senha;
    private boolean admin;
    private boolean loginUsuario;

    // Constructor
    public Usuario(String nome, String email, String senha, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    // Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(boolean loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    // Métodos especiais
    public void realizarLogin() {
        this.loginUsuario = true;
        System.out.println(getNome() + " Fez login na máquina.");

    }

    public void realizarLogoff() {
        this.loginUsuario = false;
        System.out.println(getNome() + " Fez o logoff na máquina");

    }

    public void alterarDados(String novoNome, String novoEmail) {

        if (novoNome.matches("[a-zA-Z ]+")) {
            setNome(novoNome);
        } else {
            System.out.println("O nome não pode ter numero ou acentos.");
        }

        if (novoEmail.contains("@") && novoEmail.contains(".")) {
            setEmail(novoEmail);
        } else {
            System.out.println("Novo email digítado de forma incorreta.");
        }
    }

    public void alterarSenha(String novaSenha) {
        setSenha(novaSenha);

    }
}
