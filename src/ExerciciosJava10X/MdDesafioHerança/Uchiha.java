package ExerciciosJava10X.MdDesafioHerança;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarInformacoes(){
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Missão:" + missao);
        System.out.println("Status da Missão:" + statusMissao);
        System.out.println("Habilidade -> " + habilidadeEspecial);
    }

}
