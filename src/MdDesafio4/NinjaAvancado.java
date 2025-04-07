package MdDesafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    String expert;

    public NinjaAvancado(String aldeia, String habilidade, String nome, int idade, String expert) {
        super(aldeia, habilidade, nome, idade);
        this.expert = expert;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + expert);
    }

    @Override
    public void executarHabilidade(){
        System.out.print("Lançando a habilidade " + habilidade + " de" +
                " especialidade Fogo");

    }

}
