package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {
        // Criação de um ninja básico
        Ninja Naruto = new NinjaBasico("Naruto Uzumaki", 17,TipoHabilidade.NINJUTSU);
        Naruto.mostrarIformacoes();
        Naruto.executarHabilidade();

        // Criação de um ninja avançado
        Ninja Kakashi = new NinjaAvancado("Kakashi Hatake", 20,TipoHabilidade.RINNEGAN,"Sharingan");
        Kakashi.mostrarIformacoes();
        Kakashi.executarHabilidade();
    }
}
