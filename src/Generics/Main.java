package Generics;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {

        //TODO: Assim seria a forma tradiciona de instanicar um objeto por vez para adicionar a lista
        // porem aqui vamos colocar todos os tipos de dado dentro de uma List generica. (GENERICS/)
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");


        BolsaGenerica<EquipamentosNinja> bolsa = new BolsaGenerica<>();
        bolsa.adicionarEquipamentos(kunai);
        bolsa.adicionarEquipamentos(shuriken);
        bolsa.adicionarEquipamentos(pergaminho);
        System.out.println(bolsa);

        // Caixa para Strings
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.adicionar("Olá, Generics!");
        System.out.println(caixaDeTexto.obter());

        // Caixa para Integers
        Caixa<Integer> caixaDeNumero = new Caixa<>();
        caixaDeNumero.adicionar(42);
        System.out.println(caixaDeNumero.obter());

        Caixa<Double> caixadd = new Caixa<>();
        caixadd.adicionar(55.9);
        System.out.println(caixadd.obter());

        System.out.println("************************************************************");




    }
}
