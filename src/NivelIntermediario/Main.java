package NivelIntermediario;

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

        //aplicando metodos aos objetos
       /* Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);
        int qntFalta = Sasuke.anosParaSeTronarHokage(35);
        System.out.println("voce tem: " + Sasuke.idade + " Então falta no minimo: " + qntFalta);
        */


    }

}
