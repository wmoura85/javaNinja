package Desafio2;
import java.util.Scanner;

public class Desafio2Certo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Array para armazenar os ninjas, declarado fora do laço para persistência
            String[] ninjas = new String[0];
            int opcao;

            do {
                System.out.println("\n===== Menu Ninja =====");
                System.out.println("1. Cadastrar Ninja");
                System.out.println("2. Listar Ninjas");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();
                scanner.nextLine(); // Consome a quebra de linha deixada pelo nextInt()

                switch (opcao) {
                    case 1:
                        System.out.println("Digite os nomes dos Ninjas a serem cadastrados (digite 'sair' para finalizar):");
                        while (true) {

                            String entrada = scanner.nextLine();
                            System.out.print("Digite o nome do próximo ninja: ");

                            if (entrada.equalsIgnoreCase("sair")) {
                                break;
                            }

                            // Cria um novo array com tamanho aumentado em 1
                            String[] novoArray = new String[ninjas.length + 1];
                            // Copia os ninjas já cadastrados
                            for (int i = 0; i < ninjas.length; i++) {
                                novoArray[i] = ninjas[i];
                            }
                            // Adiciona o novo ninja na última posição
                            novoArray[ninjas.length] = entrada;
                            // Atualiza a referência do array
                            ninjas = novoArray;
                        }
                        break;
                    case 2:
                        System.out.println("\nEsta é a lista de ninjas cadastrados:");
                        if (ninjas.length == 0) {
                            System.out.println("Nenhum ninja cadastrado.");
                        } else {
                            for (String ninja : ninjas) {
                                System.out.println(ninja);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Falou, valeu!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } while (opcao != 3);

            scanner.close();
        }
    }

