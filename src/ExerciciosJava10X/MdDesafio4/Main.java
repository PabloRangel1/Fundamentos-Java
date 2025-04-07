package ExerciciosJava10X.MdDesafio4;

public class Main {
    public static void main(String[] args) {


        String nome = "Pablo";
        int idade = 22;
        String aldeia = "Folha";
        String habilidade = "Kunai";
        String expert = "Fogo";

        NinjaBasico ninja = new NinjaBasico(nome, habilidade,aldeia, idade);
        ninja.mostrarInformacoes();
        System.out.println("=========================================");
        ninja.executarHabilidade();
        System.out.println("=========================================");
        NinjaAvancado ninjaAvancado = new NinjaAvancado(nome, habilidade,aldeia, idade, expert);
        ninjaAvancado.mostrarInformacoes();
        System.out.println("=========================================");
        ninjaAvancado.executarHabilidade();



    }
}
