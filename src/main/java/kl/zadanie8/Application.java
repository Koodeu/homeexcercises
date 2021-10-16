package kl.zadanie8;

public class Application {

    public static void main(String[] args) {

        ParcelValidator parcelValidator = new ParcelValidator();
        Parcel parcel = new Parcel(20, 20, 10, 24, false);
        boolean result = parcelValidator.validate(parcel);
        System.out.println(result);

    }

}
