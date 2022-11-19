package exemplosJava3;

import java.util.ArrayList;
import java.util.HashMap;

public class ExemplosJava3 {
    public static void main(String[] args) {
//        criandoArray();
//        criandoHashMap();
        tratandoExcecao();

    }

    public static void criandoArray() {
//        modo comum de criar vetores/arrays
//        String[] nomes = new String[];
//        nomes[0] = "Bruno";

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Bruno");
        nomes.add("Farias");
        System.out.println(nomes.get(1));
    }

    public static void criandoHashMap() {
        HashMap<Integer, String> nomesHsh = new HashMap<>();
        nomesHsh.put(0, "Bruno");
        nomesHsh.put(456, "Farias");
        System.out.println(nomesHsh.get(456));
    }

    public static void tratandoExcecao() {
        String numero = "10dddd";
        try {


            int num = Integer.parseInt(numero);
            System.out.println(num);
        } catch (Exception e) {
            throw  new RuntimeException("Parse inválido");

        }
    }
}
