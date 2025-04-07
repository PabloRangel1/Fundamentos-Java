package MdDesafio6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

         //Iniciar o linkedList com 7 Ninjas
        LinkedList<Ninja> linked = new LinkedList<Ninja>();
        // Adicionando 7 ninjas
        linked.add(new Ninja("Naruto", 20, "Folha"));
        linked.add(new Ninja("Sasuke", 21, "Folha"));
        linked.add(new Ninja("Sakura", 19, "Folha"));
        linked.add(new Ninja("Kakashi", 30, "Folha"));
        linked.add(new Ninja("Hinata", 18, "Folha"));
        linked.add(new Ninja("Shikamaru", 22, "Folha"));
        linked.add(new Ninja("Ino", 20, "Folha"));
        // Listar os Ninjas
        System.out.println("---------> Lista de Ninjas <--------- ");
      /*  for (Ninja variavel : linked){
            System.out.println(variavel);
        }*/
        // Adicionar o ninja no INICIO da lista
        linked.addFirst(new Ninja("Boruto", 9, "Konoha"));
         for (Ninja variavel : linked){
            System.out.println(variavel);
        }

         // Remover o Ninja no Inicio da Lista
        Ninja removido = linked.removeFirst();
        System.out.println("Removido -> " + removido);
        for (Ninja listaAtualizada : linked){
            System.out.println("Lista de ninjas dps da att " + listaAtualizada);
        }

        // Procurar ninja por index
        Ninja terceiroNinja = linked.get(3);
        System.out.println("Terceiro Ninja " + terceiroNinja);


    }
}
