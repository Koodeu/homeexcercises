package kl.zadanie4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Container {

    private Map<String, List<String>> containerMap = new HashMap<>();

    public void addToContainer(String key, String value) {
        List<String> values = containerMap.get(key);
        if (values == null) {
            values = new ArrayList<>();
            values.add(value);
            containerMap.put(key, values);
        } else {
            values.add(value);
        }
    }


    public void printValues(String key){
        System.out.println(containerMap.get(key));

    }

    public void findValues(String value){
        for(Map.Entry<String, List<String>> entry : containerMap.entrySet()){
            if (entry.getValue().contains(value)){
                System.out.println(entry.getKey());
            }
        }
    }


    @Override
    public String toString() {
        return "Container{" +
                "containerMap=" + containerMap +
                '}';
    }
}




