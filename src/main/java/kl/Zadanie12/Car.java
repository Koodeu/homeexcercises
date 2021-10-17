package kl.Zadanie12;

import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private String model;
    private double price;
    private int yearOfProduction;
    private List<Manufacturer> manufacturerList;
    private EngineType engineType;

    public Car(String name, String model, double price, int yearOfProduction, List<Manufacturer> manufacturerList, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                yearOfProduction == car.yearOfProduction &&
                Objects.equals(name, car.name) &&
                Objects.equals(model, car.model) &&
                engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfProduction, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                ", manufacturerList=" + manufacturerList +
                ", engineType=" + engineType +
                '}';
    }
}

