package Desafios.Desafio6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Iniciar uma Linked list com 7 ninjas
        LinkedList<Ninja> listaNInjas = new LinkedList<Ninja>();

        listaNInjas.add(new Ninja("Naruto", 17, "Konoha"));
        listaNInjas.add(new Ninja("Sasuke", 17, "Konoha"));
        listaNInjas.add(new Ninja("Sakura", 17, "Konoha"));
        listaNInjas.add(new Ninja("Kakashi", 31, "Konoha"));
        listaNInjas.add(new Ninja("Itachi", 21, "Konoha (Ex-Akatsuki)"));
        listaNInjas.add(new Ninja("Gaara", 18, "Areia"));
        listaNInjas.add(new Ninja("Rock Lee", 17, "Konoha"));

        //Listar ninjas
        System.out.println("_________Lista de Ninjas____________");

        for (Ninja ninja : listaNInjas) {
            System.out.println(ninja);
        }

        //Adicionar o ninja no inicio da Lista
        listaNInjas.addFirst(new Ninja("Jiraya", 50, "Konoha"));

        System.out.println(listaNInjas);

        //Remover o ninja no inicio da Lista
        listaNInjas.removeFirst();

        System.out.println(listaNInjas);

        //Buscar um ninja por índice
        Ninja terceiroNinja = listaNInjas.get(2);

        System.out.println(terceiroNinja.getNome());

    }
}
