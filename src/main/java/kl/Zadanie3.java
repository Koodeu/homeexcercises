package kl;

import java.util.HashMap;
import java.util.Map;

public class Zadanie3 {

    public static void main(String[] args) {

        Map<String, String> mapa = new HashMap<>();
        mapa.put("krystian", "limiera");
        mapa.put("adam", "kowalski");
        mapa.put("jola", "maruda");
        mapa.put("jula", "brzydula");


        printLangs(mapa);

    }

    public static void printLangs(Map<String, String> map) {
        int i = 1;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (i < map.size()) {
                System.out.println(entry.getKey() + " " + entry.getValue() + ",");
                i++;
            }

            else {
                System.out.println(entry.getKey() + " " + entry.getValue() + " - to jest ostatni wpis");
            }

        }


    }
}
