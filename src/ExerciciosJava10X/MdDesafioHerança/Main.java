package ExerciciosJava10X.MdDesafioHerança;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;
        Ninja ninja = new Ninja();
        Uchiha ninjaUchiha = new Uchiha();

        do {
            System.out.println("===== Ninjas =====");
            System.out.println("1. Adicionar um novo Ninja");
            System.out.println("2. Exibir informações");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    // Código para add um novo ninja
                    //inputs
                    System.out.print("Nome: ");
                    ninjaUchiha.nome = sc.next();
                    System.out.print("Idade: ");
                    ninjaUchiha.idade = sc.nextInt();
                    System.out.print("missao: ");
                    ninjaUchiha.missao = sc.next();
                    System.out.print("statusMissao: ");
                    ninjaUchiha.statusMissao = sc.next();
                    System.out.print("habilidadeEspecial: ");
                    ninjaUchiha.habilidadeEspecial = sc.next();
                    break;

                case 2:
                    // Código para mostrar todos os ninjas
                    ninjaUchiha.mostrarInformacoes();
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

    }
}
