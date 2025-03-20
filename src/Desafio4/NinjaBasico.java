package Desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void executarHabilidade() {
        System.out.println("O Ninja " + nome + " executou a habilidade: " + habilidade);
        System.out.println("=========================================");
    }
    @Override
    public void mostrarIformacoes() {
        System.out.println("Ninja Avançado:");
        System.out.println("Ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("=========================================");
    }
}
