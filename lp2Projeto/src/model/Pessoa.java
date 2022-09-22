package model;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String tel;

    public Pessoa(String nome, String cpf, String tel) {
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;

    }

    public Pessoa() {}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    @Override
    public String toString() {
        return ("Nome: " + this.nome + "\nCPF: " + this.cpf + "\nTel: " + this.tel);
    }


}
