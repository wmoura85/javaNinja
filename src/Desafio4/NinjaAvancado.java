package Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja {

    String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarIformacoes() {
        System.out.println("Ninja Avançado:");
        System.out.println("Ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println(nome + " tem a habilidade especial " + especialidade);
        System.out.println("=========================================");
    }

}
