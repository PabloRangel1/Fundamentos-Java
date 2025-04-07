package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //QUEUE chamadas de Filas
        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Sakura");
        ninjaQueue.add("Kakashi");
        ninjaQueue.add("Shikamaru");

        // Mostrar na fila
        System.out.println("Queue/Fila -> " + ninjaQueue);

        // Tirar um ninja da fila
        // Vai direto no elemento HEAD e "Tira"
        ninjaQueue.poll();
        System.out.println("Ninjas Na fila depois do POLL" + ninjaQueue);

        // Como ver quem é o primeiro
        System.out.println("Ninja no head: " + ninjaQueue.peek());

        ninjaQueue.add("Hashirama");
        ninjaQueue.add("Tobirama");
        System.out.println("Ninjas na Fila: " + ninjaQueue);

        // nao da pra detelar o tail

        //Esvaiar Lista
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        System.out.println("Ninjas na fila ->" + ninjaQueue);


        // Verificar se esta vazia esta fila
        if(ninjaQueue.isEmpty()){
            System.out.println("A fila stá vazia");
        }else {
            System.out.println("Queue -> " + ninjaQueue);
        }


    }
}
