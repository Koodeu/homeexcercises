package kl.Zadanie12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsApp {

    public static void main(String[] args) {

        Manufacturer manufacturer1 = new Manufacturer("Valeo", 1901, "Poland");
        Manufacturer manufacturer2 = new Manufacturer("Rupert", 1912, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("AMG", 1904, "Russia");
        Manufacturer manufacturer4 = new Manufacturer("Romet", 1980, "Belarus");
        Manufacturer manufacturer5 = new Manufacturer("GTC", 2001, "France");

        List<Manufacturer> manufacturerList1 = Arrays.asList(manufacturer1, manufacturer2, manufacturer3);
        List<Manufacturer> manufacturerList2 = Arrays.asList(manufacturer1, manufacturer2, manufacturer3, manufacturer5);
        List<Manufacturer> manufacturerList3 = Arrays.asList(manufacturer1, manufacturer3, manufacturer5, manufacturer4, manufacturer2);
        List<Manufacturer> manufacturerList4 = Arrays.asList(manufacturer1, manufacturer3);


        Car car1 = new Car("Opel", "Astra", 12500.00, 2014, manufacturerList1, EngineType.V12);
        Car car2 = new Car("Opel", "Vectra", 8500.00, 2000, manufacturerList2, EngineType.S4);
        Car car3 = new Car("Toyota", "Corolla", 6800.00, 1991, manufacturerList3, EngineType.S6);
        Car car4 = new Car("Jeep", "X12", 128000.00, 2021, manufacturerList4, EngineType.V12);

        List<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);


        CarService carService = new CarService(carsList);

        List<Car> carsV12 = carService.getV12EngineCars(carsList);
        System.out.println("Auta z silnikiem V12:" + carsV12);


        List<Car> carsBefore1999 = carService.getCarsProducedBefore1999(carsList);
        System.out.println("Auta wyprodukowane przed 1999:" + carsBefore1999);

        System.out.println("Najdroższe auto:" + carService.getMostExpensiveCar(carsList));
        System.out.println("Najtańsze auto:" + carService.getCheapestCar(carsList));

        System.out.println("Auta z trzema producentami i więcej: " + carService.getCarsWithAtLeat3Manufacturers(carsList));

                System.out.println(carService.sortList(carsList, "descending"));

        System.out.println(carService.isGivenCarModelOnTheList(carsList, "Astra"));

    }
}
