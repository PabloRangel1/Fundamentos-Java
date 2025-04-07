package ExerciciosCopilot.ExercicioIAList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainList1 {
    public static void main(String[] args) {
        /*1. Lista de Nomes
        Crie um programa que permite ao usuário adicionar nomes a uma lista.Depois de inserir os nomes, exiba todos os
        nomes da lista, um por linha.*/


        Scanner sc = new Scanner(System.in);
        String nomes = "";
        System.out.println("Qual o nome ? ");

        List<String> listName = new ArrayList<>();
        while (!nomes.equals("sair")) {
            System.out.println("Digite um nome (ou 'sair' para encerrar):");
            nomes = sc.nextLine(); // Lê um novo valor do usuário

            if (!nomes.equals("sair")) { // Adiciona apenas se for diferente de "sair"
                listName.add(nomes);
            }
        }

        // Exibe os nomes da lista
        System.out.println("Nomes na Lista:");
        for (String nome : listName) {
            System.out.println(nome);
        }


    }
}
