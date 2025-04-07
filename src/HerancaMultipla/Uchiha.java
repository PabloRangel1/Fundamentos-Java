package HerancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface, AnbuInterface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoes, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoes, rank);
    }

    //Metodo vem direto da interface
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: " + nome + " golpe Uchiha ");
    }

    public void anbuElite(){
        System.out.println("Esse ninja tambem é Anbu");
    }

}
