package kl.zadanie15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Car {

    FERRARI(1200, 180),
    PORSCHE(1500, 120),
    MERCEDES(3000, 90),
    BMW(8000, 192),
    OPEL(9000, 121),
    FIAT(6700, 188),
    TOYOTA(7100, 120);


    private final double price;
    private final double power;

    public static List<Car> premiumCars = Arrays.asList(FERRARI, PORSCHE, MERCEDES);


    Car(double price, double power) {
        this.price = price;
        this.power = power;
    }

    boolean isPremium() {
     return premiumCars.contains(this);
    }

    boolean isRegular() {
      return   !premiumCars.contains(this);
    }


    }
