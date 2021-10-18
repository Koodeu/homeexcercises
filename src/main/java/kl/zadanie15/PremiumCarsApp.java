package kl.zadanie15;


public class PremiumCarsApp {
    public static void main(String[] args) {

        Car opel = Car.OPEL;
        Car ferrrari = Car.FERRARI;

        System.out.println(opel.isPremium());
        System.out.println(opel.isRegular());
        System.out.println(opel.isFasterThan(ferrrari));
        System.out.println(ferrrari.isFasterThan(opel));

    }
}


