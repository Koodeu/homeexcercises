package kl.zadanie5;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//        List<String> list = Arrays.asList("bolek", "lolek");
        SDAHashSet sdaHashSet = new SDAHashSet(Arrays.asList("bolek", "lolek"));
        System.out.println("Podwójna wielkość listy to: " + sdaHashSet.size());
        sdaHashSet.clear();
        System.out.println(sdaHashSet.size());



    }

}
