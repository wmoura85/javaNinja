package NivelIntermediario;

public class missoes extends Ninja{

    private String nome;
    private RankDeMissoes rank;

    public missoes() {
    }

    public missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    //Metodo para mostrar as informaçoes das missões
    public void exibirDetalhes(){
        System.out.println("Missão: " +nome + " - Rank: " + rank + " ,Descrição: " + rank.getDescricao() + " ,Dificuldade: " + rank.getDificuldade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
