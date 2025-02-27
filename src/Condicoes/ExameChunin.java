package Condicoes;

import java.util.Scanner;

public class ExameChunin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Sua idade, Jovem ninja: ");
        int idade = scanner.nextInt();

        if (idade >= 12) {
            System.out.println("Parabéns! você pode participar do Exame Chunin!");
        } else {
            System.out.println("Você ainda é muito jovem para o Exame Chunin. Continue treinando!18");
        }
        scanner.close();
    }
}
