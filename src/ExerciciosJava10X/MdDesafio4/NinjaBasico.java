package ExerciciosJava10X.MdDesafio4;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String aldeia;
    String habilidade;

    public NinjaBasico(String nome, String habilidade, String aldeia, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
    }

    public void executarHabilidade(){
        System.out.println("Lançando a " + habilidade);
    }



}
