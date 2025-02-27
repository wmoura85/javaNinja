package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de Repetição : repetir uma ação infinitamente ou ate o ponto determinado
        * WHILE = FOR
         */

        // WHILE
        // while (condicao) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;

        while (numeroDeClones <= numeroMaxDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto ja criou "  + numeroDeClones + " clones!");
        }

        //FOR

        for (int i = 0; i < numeroMaxDeClones; i++) {
            System.out.println();
        }

    }
}
