package Conteudo;

public class Uzumaki extends Ninja {

    Bijus biju;

    public Uzumaki() {

    }
    public Uzumaki(String nome, int idade, String aldeia, NivelNinja rank, int numeroDeMissoes) {
        super(nome, idade, aldeia, rank, numeroDeMissoes);
    }
    // Contrutor aceitando nossa interface
    public Uzumaki(String nome, int idade, String aldeia, NivelNinja rank, int numeroDeMissoes, Bijus biju) {
        super(nome, idade, aldeia, rank, numeroDeMissoes);
        this.biju = biju;
    }



   /* @Override
    public void tacarKonai(){
        System.out.println("Teste de tacarKonai explicit Uzumaki");
    }*/

    public void uzumakiii(){
        System.out.println("Sou uzumaki");
    }


}
