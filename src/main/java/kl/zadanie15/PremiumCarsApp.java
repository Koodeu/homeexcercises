package kl.zadanie15;


public class PremiumCarsApp {
    public static void main(String[] args) {

        Car opel = Car.OPEL;
        Car toyota = Car.TOYOTA;
        Car ferrari = Car.FERRARI;

        System.out.println(opel.isPremium());
        System.out.println(ferrari.isPremium());



    }
}
