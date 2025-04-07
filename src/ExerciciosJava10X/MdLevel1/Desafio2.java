package ExerciciosJava10X.MdLevel1;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int indiceCadastro = 0;
        String[] cadastrarNinjas = new String[4];
        String n1;

        do {
            System.out.println("===== Sistema de Cadastro de Ninjas =====");
            System.out.println("1. Cadastrar novo ninja");
            System.out.println("2. Listar todos os ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Código para cadastrar um novo ninja
                    if(indiceCadastro < cadastrarNinjas.length){
                        System.out.println("Cadastrando novo ninja...");
                        System.out.println("Escolha o nome");
                        n1 = scanner.next();
                        cadastrarNinjas[indiceCadastro] = n1;
                        indiceCadastro++;
                        System.out.println("Ninja Cadastrado com sucesso");
                    }else {
                        System.out.println("Limite de ninjas atingido! Não é possível cadastrar mais.");
                    }
                    break;

                case 2:
                    // Código para listar todos os ninjas
                    System.out.println("Listando todos os ninjas...");
                    for (int i = 0; i < indiceCadastro; i++) {
                        System.out.println(cadastrarNinjas[i]); // Exibe apenas os nomes cadastrados
                    }
                    break;

                case 3:
                    // Sair do sistema
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    // Opção inválida
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3); // Repete até o usuário escolher sair

        scanner.close();
    }
}
