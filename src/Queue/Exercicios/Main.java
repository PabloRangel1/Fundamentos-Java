package Queue.Exercicios;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Cliente> clienteFila = new LinkedList<>();

        Cliente c1 = new Cliente("Marcos", 30);
        Cliente c2 = new Cliente("Pablo", 30);
        Cliente c3 = new Cliente("Matheus", 30);
        Cliente c4 = new Cliente("Luis", 30);
        Cliente c5 = new Cliente("Daniel", 30);

        clienteFila.add(c1);
        clienteFila.add(c2);
        clienteFila.add(c3);
        clienteFila.add(c4);
        clienteFila.add(c5);
        System.out.println("Fila: " + clienteFila);
        System.out.println("Cliente Atendido" + clienteFila.poll());
        System.out.println("Fila Atualizada " + clienteFila);
    }

    public static void adicionaCliente(Queue<Cliente> fila, Cliente cliente) {
        fila.add(cliente);
    }

}
