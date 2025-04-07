package Polimorfismo;

public class Uzumaki extends Ninja{

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + "ATK DE AR -> ");
    }

}
