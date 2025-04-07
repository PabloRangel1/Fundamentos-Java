package List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Array Padrão
        String[] teste = new String[3];
        teste[0] = "Olá isto é um array ultrapassado";
        System.out.println(teste[0]);
        System.out.println("-----List-----");
        // Usando List // ArrayList
        List<String> ninjaList = new ArrayList<>();
        // ADD
        ninjaList.add("Teste0"); //INDEX
        ninjaList.add("Teste1");
        ninjaList.add("Teste2");
        ninjaList.add("Teste3");
        ninjaList.add("Teste4");// -> Foi removido
        System.out.println("Lista ADD -> " + ninjaList);
        // Remove
        ninjaList.remove("Teste3");
        System.out.println("Lista Remove -> " + ninjaList);
        // Trocar elementos
        ninjaList.set(2, "Substituição Teste999");
        System.out.println("Sub -> " + ninjaList);
        // Ver tamanho da Lista
        System.out.println("Tamanho List -> " + ninjaList.size());
        //



    }
}
