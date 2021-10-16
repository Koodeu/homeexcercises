package kl.zadanie3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Zadanie3 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Java", 18);
        map.put("Python", 1);
        map.put("Pascal", 2);
        map.put("Kotlin", 78);
        map.put("PHP", 0);

        iterate(map);
        System.out.println("====DRUGA METODA====");
        iterateHasNext(map);


    }


    public static void iterate(Map<String, Integer> map) {

        int i = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (i < map.size()) {
                System.out.println(entry.getKey() + " " + entry.getValue() + ",");

            } else {
                System.out.println(entry.getKey() + " " + entry.getValue() + ".");

            }
            i++;
        }
    }

    public static void iterateHasNext(Map<String, Integer> map) {

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (map.entrySet().iterator().hasNext()) {
                System.out.println(entry.getKey() + " " + entry.getValue() + ",");

            } else {
                System.out.println(entry.getKey() + " " + entry.getValue() + ".");

            }

        }

    }
}





