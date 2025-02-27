package Desafio1;

public class PrimeiroDesafio {
    public static void main(String[] args) {

        String[] ninjas = {"Naruto", "Sai", "Sasuke"};
        int[] idades = {12, 20, 16};
        String[] missoes = {"Missão de escolta", "missão de Infiltração", "missão de Suprimentos"};
        char[] niveis = {'A', 'D', 'A'};
        String[] status = {"Não concluída", "Não concluída", "Não concluída"};

        for (int i = 0; i < ninjas.length; i++) {
            if (idades[i] >= 15 || (niveis[i] == 'C' || niveis[i] == 'D')){
                status[i] = "Concluída";
            }
        }

        for (int i = 0; i < ninjas.length; i++){
            System.out.println("Ninja: " + ninjas[i]);
            System.out.println("Idade: " + idades[i]);
            System.out.println("Missão: " + missoes[i]);
            System.out.println("Nível: " + niveis[i]);
            System.out.println("Status: " + status[i]);
            System.out.println("=============================");
        }
    }

}
