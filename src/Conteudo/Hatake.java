package Conteudo;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    public void boasVindas(){
        System.out.println(nome + ": Eu sou um Hatake");
    }

    public void habilidadeEspecial(){
        System.out.println("-> ATK UMBRA ");
    }

    public void anbuElite(){
        System.out.println("Esse ninja tambem é Anbu");
    }

    public void sharinganAtivado(){
        System.out.println("Sharingan Activited");
    }

}
