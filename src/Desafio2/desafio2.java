package Desafio2;

import java.util.Scanner;

public class desafio2 {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      String[] ninja = new String[0];
      int opcao;

      do {
         System.out.println("\n===== Menu Ninja =====");
         System.out.println("1. Cadastrar Ninja");
         System.out.println("2. Listar Ninjas");
         System.out.println("3. Sair");
         System.out.print("Escolha uma opção: ");

         opcao = scanner.nextInt();
         scanner.nextLine();

         switch (opcao) {
            case 1: {
               System.out.println("Digite o nome do Ninja a ser cadastrado (digite 'sair' para finalizar): ");
               while (true) {
                  String entrada = scanner.nextLine();
                  System.out.println("Digite o nome do proximo ninja: ");

                  if (entrada.equalsIgnoreCase("sair")) {
                     break;
                  }
                  //Cria um outro array mais 1
                  String[] criaNinja = new String[ninja.length + 1];

                  //Copiar os ninjas criados para o array criaNinja
                  for (int i = 0; i < ninja.length; i++) {
                     criaNinja[i] = ninja[i];
                  }

                  //add um novo ninja no final do array
                  criaNinja[ninja.length] = entrada;

                  // Atualiza a referencia para o proximo ninja
                  ninja = criaNinja;
               }
               break;
            }
            case 2: {
               System.out.println("Esta é a lista de Ninjas cadastrados: ");
               for (String lista : ninja) {
                  System.out.println(lista);
               }
               break;
            }
            case 3: {
               System.out.println("Falou valeu!");
               break;
            }
            default:
               System.out.println("Opção invalida!");
               break;
         }
      } while (opcao != 3);
      scanner.close();
   }
}

   