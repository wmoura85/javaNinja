package NivelIntermediario;

public class Ninja {
    //TODO: Incluir dois novos atributos: numeroDeMissoesConcluidas , Rank

    String nome;
    int idade;
    String aldeia;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos

    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, idade,aldeia);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    //criando um metodo publico personalizado

    /*
    * O metodo Void não retorna nenhum valor

    public void SharinganAtivado() {
        System.out.println("O sahringan Ativou!!!");
    }  */

    /*
    * Metodo String retorna uma string

    public String euSouUmNinja() {
        return "Eu Sou um Ninja!";
    }*/

    /*
    *Metodo int retorna um numero

    public int anosParaSeTronarHokage(int idadeMinimaParaHokage) {
        return idadeMinimaParaHokage - idade;
    } */

}
