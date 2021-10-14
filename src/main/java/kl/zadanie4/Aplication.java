package kl.zadanie4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aplication {

    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addToStorage("polska", "lodz");
        storage.addToStorage("polska", "krakow");
        storage.addToStorage("polska", "warszawa");
        storage.addToStorage("Niemcy", "warszawa");

        storage.findValues("warszawa");
//        storage.printValues("polska");

        Container container =new Container();
        container.addToContainer("polska","lodz");
        container.addToContainer("polska","pabanice");
        container.addToContainer("polska","adamów");
        container.addToContainer("francja","adamów");
        container.addToContainer("niemcy","berlin");
        container.addToContainer("niemcy","hamburg");
        System.out.println(container.toString());


        container.printValues("niemcy");
        container.findValues("adamów");

//        Cities cities = new Cities();
//        cities.addToCities("Polska", "Pabanice");
//        cities.addToCities("Polska", "Lodz");
//        cities.addToCities("UK", "Londyn");
//        System.out.println(cities.toString());
    }
}
