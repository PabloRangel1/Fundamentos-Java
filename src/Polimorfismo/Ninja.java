package Polimorfismo;

public abstract class Ninja implements  Estrategia {

    String nome;
    int idade;
    String aldeia;

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //Metodo Geral
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + "com o ataque especial");
    }
    //abs
    @Override
    public void estrategia(){
        System.out.println("Meu nome é: " + nome
                + "Essa é minha estratégia de combate");
    };

}
