package ExerciciosCopilot.ExercicioIALacoDeRep;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        // Calculadora
        int tabuada = 0;
        int multi = 0;
        System.out.println("Calculadora");
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual numero voce deseja a tabuada ? ");
        tabuada = sc.nextInt();

        System.out.println("Tabuada do " + tabuada);
        for (int i = 1; i <= 10; i++) {
            multi = tabuada * i;
            System.out.println("-> " + tabuada + "x" + i + " = " + multi);
        }

    }
}
