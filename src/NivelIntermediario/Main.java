package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Criar um Ninja
        Ninja Sasuke = new Ninja();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da Folha";

       //aplicando metodos aos objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);
        int qntFalta = Sasuke.anosParaSeTronarHokage(35);
        System.out.println("voce tem: " + Sasuke.idade + " Então falta no minimo: " + qntFalta);

        Ninja Naruto = new Ninja();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da Folha";

        Ninja Sakura = new Ninja();

        Sakura.nome = "Sakura Uchiha";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da Folha";


    }

}
