package Polimorfismo;

public class Uchiha extends  Ninja{
 
    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }                                         

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " TOMA atk uchiha ");
    }



}
