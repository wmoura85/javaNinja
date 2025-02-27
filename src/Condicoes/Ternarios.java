package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Trenarios:
        *  Redução de codigo
        * variavel = (condição) ? valorseVerdadeiro : valorseFalso
        *
         */

        short numeroDeMissoes = 11;
        String nivelNinja = (numeroDeMissoes >= 10) ? "Este Ninja esta com mais de 10 missões" : "Este Ninja esta com menos de 10 missões";
        System.out.println(nivelNinja);


    }
}
