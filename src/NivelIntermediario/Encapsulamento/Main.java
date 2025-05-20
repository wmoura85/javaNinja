package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Naruto Uzumaki ------------------- ");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da folha", 16, 5,1.75);
        System.out.println("meu nome é: " +naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println("meu nome é: " +naruto.getNome());


        System.out.println("--------------- Sasuke Uchiha ------------------- ");
    }

}
