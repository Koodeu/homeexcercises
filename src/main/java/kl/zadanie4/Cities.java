package kl.zadanie4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cities {

    private Map<String, List<String>> citiesMap = new HashMap<>();

    @Override
    public String toString() {
        return "Cities{" +
                "citiesMap=" + citiesMap +
                '}';
    }

    public void addToCities(String key, String value) {

        List<String> values = citiesMap.get(key);

        if (values == null) {
            values = new ArrayList<>();
            values.add(value);
            citiesMap.put(key, values);
        } else {
            values.add(value);
        }

    }


}
