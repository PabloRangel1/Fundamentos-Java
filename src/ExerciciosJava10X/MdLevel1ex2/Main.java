package ExerciciosJava10X.MdLevel1ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] alunos = new String[4];
        String nomeAluno;
        int numeroAlunos = 0;
        int opcao = 0;

        do{
            System.out.println("============Cadastrar Aluno============");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Encerrar");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Nome do aluno: ");
                    nomeAluno = sc.next();
                    alunos[numeroAlunos] = nomeAluno;
                    numeroAlunos++;
                    break;
                case 2:
                    for (int i = 0; i < numeroAlunos; i++) {
                        System.out.println(alunos[i]);
                    }
                    break;
                case 3:
                    System.out.println("Programa Finalizando ... ");
            }

        }while (opcao != 3);



    }
}
