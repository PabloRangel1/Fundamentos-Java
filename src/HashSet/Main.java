package HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Danzo");
        ninjas.add("Kakashi");
        ninjas.add("Boruto");

        System.out.println("ninjas = " + ninjas);

        Set<String> ninjasSet = new TreeSet<>();
        ninjasSet.addAll(ninjas);

        System.out.println("ninjasSet = " + ninjasSet);

    }

}
