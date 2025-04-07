package ClasseAbstrata;

public abstract class Ninja {

    public String nome;
    public String aldeia;
    public int idade;

    public abstract void nomeDoNinja();

    public void atk(){
        System.out.println("Lanaçando kunai ...");
    }

}
