package ExerciciosCopilot.ExercicioIALacoDeRep;

import java.util.Scanner;

public class MainSomaDosValores {
    public static void main(String[] args) {
        int soma = 0; // Variável para armazenar a soma total
        int cont = 1; // Contador inicializado como 1
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular a soma: ");
        int valor = sc.nextInt();

        // Laço para acumular os valores de 1 até o número fornecido
        while (cont <= valor) {
            soma += cont; // Soma o valor do contador à soma
            cont++; // Incrementa o contador
        }
        System.out.println("A soma dos números de 1 até " + valor + " é: " + soma);

    }
}