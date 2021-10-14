package kl;

import java.util.*;
import java.util.stream.Collectors;

public class Zadania1i2SortList {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("Xavier");
        list.add("Benek");
        list.add("Ada");
        list.add("Adam");
        list.add("Kasia");
        list.add("Zosia");
        list.add("xavier");
        list.add("zosia");

        List<String> list2 = Arrays.asList("Lolek", "Bolek", "Tola", "Ada", "lolek", "bolek");

        sortListOfStrings(list);
        sortListOfStringsCaseInsensitive(list);
        sortListOfStringsFromStream(list2);

        List<String> output = sortList(list2);
        System.out.println(output);
    }

    //Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę
    //posortowaną alfabetycznie od Z do A.

    //pierwszy sposób przez Collections.sort
    public static List<String> sortListOfStrings(List<String> listOfStrings) {

        Collections.sort(listOfStrings, Collections.reverseOrder());
        System.out.println(listOfStrings);
        return listOfStrings;

    }

    //drugi sposób przez Stream
    public static List<String> sortListOfStringsFromStream(List<String> listOfStrings) {

        List<String> sortedList = listOfStrings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList);
        return listOfStrings;

    }


    //pierwszy sposób przez Collections.sort - ignorując wielkość liter
    public static List<String> sortListOfStringsCaseInsensitive(List<String> listOfStrings) {

        Collections.sort(listOfStrings, String.CASE_INSENSITIVE_ORDER.reversed());
        System.out.println(listOfStrings);
        return listOfStrings;

    }

    //inny sposób
    public static List<String> sortList(List<String> listToSort){
        List<String> input = new ArrayList<>(listToSort);
        input.sort(Comparator.reverseOrder());
        return  input;
    }


}
