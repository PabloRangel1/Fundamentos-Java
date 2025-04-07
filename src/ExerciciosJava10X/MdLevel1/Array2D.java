package ExerciciosJava10X.MdLevel1;

public class Array2D {

    public static void main(String[] args) {
        //Escreva um programa que conta quantos números pares e ímpares existem em um array.
        double[] numeros = {10.5, 8.0, 7.5, 9.0};
        int imp = 0;
        int par = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                par++;
            } else {
                imp++;
            }

        }
        System.out.println("N° de pares " + par);
        System.out.println("N° de impares " + imp);


    }
}
