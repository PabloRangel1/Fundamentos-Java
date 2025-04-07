package ExerciciosCopilot.ExercicioIAList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainListCalculos {
    public static void main(String[] args) {

       /*2. Lista de Números - Cálculos
        Crie um programa que peça ao usuário para inserir números em uma lista.Após inserir os números, o programa deve:Scanner*/


        Scanner sc = new Scanner(System.in);
        int elements = 0;
        System.out.println("Insiria elementos na lista");
        List<Integer> listElements = new ArrayList<>();

        while (elements != -1) {
            System.out.println("Digite um número (ou -1 para encerrar):");
            elements = sc.nextInt();

            if (elements != -1) {
                listElements.add(elements);
            }
        }
        System.out.println("Números na lista:" + listElements);

        // Demais aplicaçoes
        CalcularList cl = new CalcularList();
        int somaResult = cl.somar(listElements);
        int maior = cl.maiorElemento(listElements);
        int menor = cl.menorElemento(listElements);
        System.out.println("Calculo da lista completa = " + somaResult);
        System.out.println("Maior elemento da lista = " + maior);
        System.out.println("Menor elemento da lista = " + menor);

    }

    public static class CalcularList {
        public int somar(List<Integer> elements) {
            int soma = 0; // Aqui está incrementando na variavel soma a cada ITERAÇÃO um valor da list "valorLista"
            for (Integer valorLista : elements) {
                soma += valorLista;
            }
            return soma;
        }

        public int maiorElemento(List<Integer> elements) {
            int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível
            for (Integer elemento : elements) {
                if (elemento > maior) { // Se o elemento for maior que 'maior', atualiza
                    maior = elemento;
                }
            }
            return maior; // Retorna o maior valor encontrado
        }

        public int menorElemento(List<Integer> elements) {
            int menor = Integer.MAX_VALUE; // Inicializa com o menor valor possível
            for (Integer elemento : elements) {
                if (elemento < menor) { // Se o elemento for maior que 'maior', atualiza
                    menor = elemento;
                }
            }
            return menor; // Retorna o maior valor encontrado
        }

    }

}
