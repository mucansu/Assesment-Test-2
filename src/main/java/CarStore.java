import java.util.*;

public class CarStore {
    List<Car> cars = new ArrayList<>();

    public CarStore() {
    }
    public void addCar(Car car) {cars.add(car);}

    public int getNumberOfCarsInStore() {
     return  cars.size();
    }

    public void sortCarsByYear() {
        cars.sort(Comparator.comparing(Car::getYear));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addNewCars(int numberOfCars, String brand, int miles, int year) {
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car(brand,miles,year));
        }
    }
}
