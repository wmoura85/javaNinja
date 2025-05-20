package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    //Inicializar o Array
    private List<T> ferramentas;

    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    //Adicionar ferramentas no array
    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);

    }

    //Mostrar Lista de ferramentas
    public void mostrarFerramenta() {
        for (T ferramenta: ferramentas) {
            System.out.println(ferramenta);
        }
    }

}
