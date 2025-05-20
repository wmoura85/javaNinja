package NivelIntermediario.Encapsulamento;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDemissoesConcluidas;
    private double altura = 2.10;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDemissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDemissoesConcluidas = numeroDemissoesConcluidas;
        this.altura = altura;
    }

    //GET para mostrar dados
    public String getNome() {
        return nome;
    }

    //Setter recebe valores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDemissoesConcluidas() {
        return numeroDemissoesConcluidas;
    }

    public void setNumeroDemissoesConcluidas(int numeroDemissoesConcluidas) {
        this.numeroDemissoesConcluidas = numeroDemissoesConcluidas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
