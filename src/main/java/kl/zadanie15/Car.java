package kl.zadanie15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Car {

    FERRARI(42000, 450, 310 ),
    PORSCHE(180000, 389, 280),
    LAMBORGHINI(600000, 650, 389),
    OPEL(89000, 140, 210),
    FIAT(65999, 120, 190);

    private double cena;
    private double power;
    private double maxSpeed;

    Car(double cena, double power, int maxSpeed) {
        this.cena = cena;
        this.power = power;
        this.maxSpeed = maxSpeed;
    }

    private static List<Car> premiumCarsList = Arrays.asList(FERRARI, PORSCHE, LAMBORGHINI);

    public boolean isPremium() {
        return premiumCarsList.contains(this);

    }

    public boolean isRegular() {
        return !premiumCarsList.contains(this);
    }

    public boolean isFasterThan(Car car) {
        if (this.maxSpeed > car.maxSpeed){
            return true;
        }
        return false;
    }

}