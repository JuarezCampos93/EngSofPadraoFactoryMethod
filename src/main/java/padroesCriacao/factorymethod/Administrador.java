package padroesCriacao.factorymethod;

public class Administrador implements Pessoa {

    private String senha;
    private String nome;
    private int rg;
    private int cpf;
    private int numeroTel;
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setRG(int rg) {
        this.rg = rg;
    }

    @Override
    public int getRG() {
        return this.rg;
    }

    @Override
    public void setCPF(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public int getCPF() {
        return this.cpf;
    }

    @Override
    public void setNumeroTel(int numero) {
        this.numeroTel = numero;
    }

    @Override
    public int getNumeroTel() {
        return this.numeroTel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
