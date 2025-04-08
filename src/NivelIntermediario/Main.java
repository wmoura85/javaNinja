package NivelIntermediario;

import com.sun.net.httpserver.HttpHandler;

public class Main {
    public static void main(String[] args) {

        //objeto 1
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.SharinganAtivado();

        //Objeto 2
        Uzamaki Naruto = new Uzamaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.modoSabioAtivado();

        //Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.ativarCura();

        //Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 16;
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.expelirChakra();

        //Objeto 5
        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi Hatake";
        Kakashi.idade = 47;
        Kakashi.aldeia = "Aldeia da Areia";
        Kakashi.boasVindas();
        Kakashi.SharinganAtivado();
        Kakashi.ninjaDeElite();

        //Objeto 6
        Uchiha Madara = new Uchiha("Madara Uchiha",30,"aldeia da areia",150,NivelNinja.GENIN);
        Madara.habilidadeEspecial();

        //aplicando metodos aos objetos
       /* Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);
        int qntFalta = Sasuke.anosParaSeTronarHokage(35);
        System.out.println("voce tem: " + Sasuke.idade + " Então falta no minimo: " + qntFalta);
        */


    }

}
