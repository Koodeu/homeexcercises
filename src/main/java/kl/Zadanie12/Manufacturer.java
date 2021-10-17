package kl.Zadanie12;

import java.util.Objects;

public class Manufacturer {

    private String name;
    private int yearOfFoundation;
    private String countryOfOrigin;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfFoundation == that.yearOfFoundation &&
                Objects.equals(name, that.name) &&
                Objects.equals(countryOfOrigin, that.countryOfOrigin);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }

    public Manufacturer(String name, int yearOfFoundation, String countryOfOrigin) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfFoundation, countryOfOrigin);
    }
}
