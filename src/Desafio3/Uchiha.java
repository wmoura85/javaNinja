package Desafio3;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public Uchiha(String nome, int idade, String missao, String nivelDificuldade, String statusMissao, String habilidadeEspecial) {
        super(nome, idade, missao, nivelDificuldade,statusMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade especial uchiha: " + habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        System.out.println("Habilidade especial uchiha: " + habilidadeEspecial);
    }

    public void atualizarHabilidade(String novaHabilidade) {
        this.habilidadeEspecial = novaHabilidade;
    }
}
