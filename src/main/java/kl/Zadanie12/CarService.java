package kl.Zadanie12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    List<Car> carsList = new ArrayList<Car>();

    public CarService(List<Car> carsList) {
        this.carsList = carsList;
    }

    public void addCarsToList(List<Car> carsList, Car car) {
        carsList.add(car);
    }

    public void removeCarFromList(List<Car> carsList, Car car) {
        carsList.remove(car);
    }

    public List<Car> returnCarsList(List<Car> carsList) {
        return new ArrayList<>(carsList); //zwraca nową listę i nikt nie będzie mógł modyfikować pierwotnej listy
    }

    public List<Car> getV12EngineCars(List<Car> carsList) {
        return carsList.stream().
                filter(car -> car.getEngineType()
                        .equals(EngineType.V12))
                .collect(Collectors.toList());

    }

    public List<Car> getCarsProducedBefore1999(List<Car> carsList) {
        return carsList.stream()
                .filter(car -> car.getYearOfProduction() < 1999)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar(List<Car> carsList) {
        return Collections.max(carsList, Comparator.comparing(car -> car.getPrice()));
    }

    public Car getCheapestCar(List<Car> carsList) {
        return Collections.min(carsList, Comparator.comparing(car -> car.getPrice()));
    }

    public List<Car> getCarsWithAtLeat3Manufacturers(List<Car> list) {
        return carsList.stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .collect(Collectors.toList());
    }

    public List<Car> sortList(List<Car> carList, String sortDirection) {
        if (sortDirection.equals("ascending")) {
            return carList.stream()
                    .sorted(Comparator.comparingDouble(Car::getPrice))
                    .collect(Collectors.toList());
        } else if (sortDirection.equals("descending")) {
            return carList.stream()
                    .sorted(Comparator.comparingDouble(Car::getPrice)
                            .reversed())
                    .collect(Collectors.toList());
        } else {
            System.out.println("Podaj kierunek sortowania: ascending lub descending");
            return null;
        }

    }

    public boolean isGivenCarModelOnTheList(List<Car> carsList, String carModel) {
        for (Car car : carsList) {
            if (car.getModel().equals(carModel)) {
                return true;
            }
        }
        return false;
    }

    public List<Car> findCarsOfGivenManufacturer(List<Car> carsList, Manufacturer manufacturer) {
        List<Car> listOfCarsOfGivenManufacturer = new ArrayList<>();

        for (Car car : carsList) {
            if (car.getManufacturerList().contains(manufacturer)) {
                listOfCarsOfGivenManufacturer.add(car);
            }
        }
        return listOfCarsOfGivenManufacturer;
    }

    public List<Car> findCarsOfGivenManufacturerAndProductionYear(List<Car> carsList, Manufacturer manufacturer, int yearOfProduction) {

        for (Car car : carsList) {
            List<Car> listOfCarsOfGivenManufacturerAndProductionYear = new ArrayList<>();
            if (car.getManufacturerList().contains(manufacturer) && car.getYearOfProduction() == yearOfProduction) {
                listOfCarsOfGivenManufacturerAndProductionYear.add(car);
                return listOfCarsOfGivenManufacturerAndProductionYear;
            }
        }
        return null;
    }


}
