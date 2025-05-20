package NivelIntermediario;

public abstract class Ninja {
    //TODO: Incluir dois novos atributos: numeroDeMissoesConcluidas , Rank

    String nome;
    int idade;
    String aldeia;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    final double altura = 2.10;

    public Ninja() {
    }

    //Todo Ninja vai fazer
    final void tacarKunai() {
        System.out.println("EU SOU UM METODO DA CLASSE MÃE!");
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
