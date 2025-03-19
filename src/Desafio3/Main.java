package Desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
/*
    public static void main(String[] args) {

        Uchiha Itachi = new Uchiha();
        Itachi.nome = "Itachi Uchiha";
        Itachi.idade = 18;
        Itachi.missao = "Resgate do Kazekage";
        Itachi.nivelDificuldade = "Médio";
        Itachi.statusMissao = "Concluída";
        Itachi.habilidadeEspecial = "Kekkei Genkai";
        Itachi.mostrarInformacoes();
        Itachi.mostrarHabilidadeEspecial();
    }*/

   public static void main(String[] args) {
        Scanner caixaTxt = new Scanner(System.in);
        ArrayList<Ninja> addNinja = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja e seus atributos");
            System.out.println("2. Listar Ninjas e suas informações");
            System.out.println("3. Atualizar Habilidade dos Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = caixaTxt.nextInt();
            caixaTxt.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = caixaTxt.nextLine();
                    System.out.println("Idade: ");
                    int idade = caixaTxt.nextInt();
                    caixaTxt.nextLine();
                    System.out.println("Missão: ");
                    String missao = caixaTxt.nextLine();
                    System.out.println("Nível de dificuldade: ");
                    String nivel = caixaTxt.nextLine();
                    System.out.println("Status da Missão: ");
                    String status = caixaTxt.nextLine();

                    addNinja.add(new Ninja(nome, idade, missao, nivel, status));
                    System.out.println("Ninja adicionado com sucesso!");
                    break;
                case 2:
                    if (addNinja.isEmpty()) {
                        System.out.println("nenhum ninja foi cadastrado.");
                    } else {
                        for (Ninja ninja : addNinja) {
                            ninja.mostrarInformacoes();
                            System.out.println("=================================");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do Uchiha para atualizar sua habilidade: ");
                    String buscaNinja = caixaTxt.nextLine();
                    boolean encontrado = false;
                    for (Ninja ninja : addNinja) {
                        if (ninja instanceof Uchiha && ninja.nome.equalsIgnoreCase(buscaNinja)) {
                            System.out.println("nova Habilidade especial: ");
                            String novaHabilidade = caixaTxt.nextLine();
                            ((Uchiha) ninja).atualizarHabilidade(novaHabilidade);
                            System.out.println("habilidade atualizada com Sucesso!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Uchiha não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Falou Valeu!");
                    break;
                default:
                    System.out.println("Opção invalida. Tente Novamente");

            }
        } while (opcao != 4);
        caixaTxt.close();

   }
}
