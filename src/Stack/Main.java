package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Array
        // São estaticos e tem ref de memoria previa (separar o espaço em memoria)
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";


        //listas
        //São dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjalist = new ArrayList<>();
        ninjalist.add("Naruto ArrayList");

        //Stack
        // O ultimo elemento que entrou é o primeiro a sair First In, First Out
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Naruto Stack");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Kakashi");
        System.out.println("Minha Stack Atual: " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Stack com pop: " + ninjaStack);
        System.out.println("Minha Stack com o proximo elemento no topo " + ninjaStack.peek());
        System.out.println("Tamanho da Stack: " + ninjaStack.size() + " elementos.");
    }
}
