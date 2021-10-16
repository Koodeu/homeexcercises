package kl.zadanie6;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<String, String> map = new TreeMap<>();
        map.put("Polska", "Warszawa");
        map.put("UK", "Londyn");
        map.put("Niemcy", "Berlin");
        map.put("Francja", "Paryż");
        printFirstAndLastEntry(map);



    }

    private static void printFirstAndLastEntry(TreeMap<String, String> treeMap){

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
//        for(Map.Entry<String, String> entry : treeMap.entrySet()){
//            System.out.println(entry.getKey() + " -  " +entry.getValue());
        }
    }



