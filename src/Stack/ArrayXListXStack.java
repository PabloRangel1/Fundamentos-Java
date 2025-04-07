package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayXListXStack {
    public static void main(String[] args) {

        String[] nomeNinjaArray = new String[5];

        System.out.println("----------- ARRAY -----------");
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        nomeNinjaArray[3] = "Hinata Hyuga";
        System.out.println("nomeNinjaArray = " + nomeNinjaArray);
        System.out.println("nomeNinjaArray[0] = " + nomeNinjaArray[4]);
        // Se tentarmos imprimir um array que não está preenchido retornará NULL
        // Estática + valor de referencia em memoria (tamanho precisa ser especificado)
        System.out.println("----------- LISTA -----------");
        // Dinamica + Diversos metodos faceis de utilizar -> Mais usada
        // toString por padrão mostra todos os elementos da lista
        // Lista é um pouco mais lenta que o ARRAY
        // Mas hoje em dia nao existe mais problema de gargalho de memoria, sobe na VM e fodasse
        // List é o mais importante
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto");
        nomeNinjaList.add("Sasuke");
        nomeNinjaList.add("Kakashi");
        System.out.println(nomeNinjaList);


        System.out.println("---------- STACK ----------");
        // Quando se está trabalhando com Stack exige uma ordenação
        // Ultimo a entrar é o primeor a sair LIFO
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha/stack = " + nomeNinjaStack.pop());
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha/stack = " + nomeNinjaStack.pop());
        nomeNinjaStack.push("Kakashi");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Ninja no topo (sem remover): " + nomeNinjaStack.peek());
        System.out.println("Mostrar Stack = " + nomeNinjaStack);

    }
}
