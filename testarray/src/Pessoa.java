public class Pessoa {
    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    private String nome;
    private int idade;
    private String endereco;

    void setNome(){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade() {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setEndereco() {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + ", idade=" + idade + ", endereco='" + endereco + '\'' + '}';
    }
}
