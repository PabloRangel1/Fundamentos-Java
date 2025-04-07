package HerancaMultipla;

public  class Ninja implements EstrategiaDeBatalha   {
    //TODO:  -> Incluir dois novo: numerosDeMissoes e nivel;
    //TODO: Rank -> Gennin,Chunnin,Jounnin, Hokage
    String nome;
    int idade;
    String aldeia;
    int numeroDeMissoes;
    NivelNinja rank;

    public Ninja(){

    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }
    //TODO: Sobrecarga do contrutor com atributos
    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoes, NivelNinja rank) {
        this(nome, idade, aldeia);
        this.numeroDeMissoes = numeroDeMissoes;
        this.rank = rank;
    }

    public Ninja(String nome, int idade, String aldeia, NivelNinja rank, int numeroDeMissoes) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.rank = rank;
        this.numeroDeMissoes = numeroDeMissoes;
    }

    public void monstrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Rank: " + rank);
        System.out.println("N° de missões: " + numeroDeMissoes);
    }


    public void estrategia(){
        System.out.println("Estrategia 1 de combate do " + nome + " -> Atacar");
    };
    @Override
    //Sobrecarga de metodo
    public void inteligenciaDeCombate(){
        System.out.println("Inteligencia de bataalha +999 . . . ");
    }
    @Override
    //Sobrecarga de metodo
    public void inteligenciaDeCombate(int qi){
       if(qi > 150){
           System.out.println("Seu qi "+ qi + " voce é um genio");
       } else if (qi >= 130) {
           System.out.println("Seu qi "+ qi + "voce é um jjina promissior");
       }
       else{
           System.out.println("Você precisa treinar mais");
       }
    }

}
