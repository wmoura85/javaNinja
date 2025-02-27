package Condicoes;

import java.util.Scanner;

public class EstudoSwicthCases {
    public static void main(String[] args) {

        /*
        * SwitchCases: Casos especificos
        * Objetivo: Pedir pro usuario escolher entre os Ninjas
        *
         */

        //solicitar para o usuario
        Scanner scanner = new Scanner(System.in);

        //opcoes
        System.out.println("escola um personagem: ");
        System.out.println("1 - Naruto Uzamaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuario escolher uma das opcoes
        int opcao = scanner.nextInt();

        System.out.println("Você selecionou o nº: " + opcao);

        //reacao a escolher
        switch (opcao) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzamaki, o proximo Hokage!");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha, o ninja mais bolado!");
                break;
            case 3:
                System.out.println("O usuario escolheu o Sakura Haruno, a melhor personagem feminina");
                break;
            default:
                System.out.println("Essta opção não é valida!");
        }


        // Fechar a caixa
        scanner.close();
    }
}
