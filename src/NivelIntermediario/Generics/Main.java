package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(5));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocação do Sapo"));

        System.out.println("Itens da bolsa do ninja: ");
        bolsaNinja.mostrarFerramenta();

    }
}
