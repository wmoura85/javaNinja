package Desafios.Desafio6;

public class Ninja {
    private String nome;
    private int idade;
    private String Vila;

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        Vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVila() {
        return Vila;
    }

    public void setVila(String vila) {
        Vila = vila;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", Vila='" + Vila + '\'' +
                '}';
    }
}
