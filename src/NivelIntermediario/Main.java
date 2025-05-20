package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------- Sasuke Uchiha ------------------------");
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", 18, "Aldeia da folha", 5, NivelNinja.GENIN);
        Sasuke.habilidadeEspecial();

        System.out.println("--------------------- Itachi Uchiha ----------------------");

        Uchiha Itachi = new Uchiha("Itachi Uchiha", 27, "Aldeia da folha", 60,NivelNinja.JOUNIN);
        Itachi.habilidadeEspecial();

        System.out.println("--------------------- Madara Uchiha ----------------------");

        Uchiha madara = new Uchiha("Madara Uchiha", 45, "Aldeia da folha", 45,NivelNinja.JOUNIN);
        madara.habilidadeEspecial();

        System.out.println("--------------------- Naruto Uzumaki ----------------------");

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki",18,"Aldeia da folha",35,NivelNinja.JOUNIN,Biju.KURAMA);
        Naruto.habilidadeEspecial();
        System.out.println(Naruto.biju);

        System.out.println("--------------------- Sakura Haruno ----------------------");

        Haruno Sakura = new Haruno("Sakura Haruno", 18, "aldeia da Folha", 20,NivelNinja.JOUNIN);
        Sakura.ativarCura();

        System.out.println("--------------------- Hinata Hyuga ----------------------");

        Hyuga Hinata = new Hyuga("Hinata Hyuga", 16, "Aldeia da folha", 18,NivelNinja.GENIN);
        Hinata.expelirChakra();

        System.out.println("--------------------- Kakashi Hatake ----------------------");
        //Objeto 5
        Hatake Kakashi = new Hatake("Kakashi Hatake",47,"Aldeia da Areia",135,NivelNinja.HOKAGE);
        Kakashi.boasVindas();
        Kakashi.SharinganAtivado();
        Kakashi.ninjaDeElite();


        //aplicando metodos aos objetos
       /* Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);
        int qntFalta = Sasuke.anosParaSeTronarHokage(35);
        System.out.println("voce tem: " + Sasuke.idade + " Então falta no minimo: " + qntFalta);
        */


    }

}
