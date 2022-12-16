import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class AssessmentTest2Level2 {


    @Test
    public void addCarsToCarStore() {

        CarStore carStore = new CarStore();

        carStore.addCar(new Car("Porsche", 1000, 2004));
        Assertions.assertEquals(1, carStore.getNumberOfCarsInStore());

        carStore.addCar(new Car("Volvo", 1200, 1993));
        Assertions.assertEquals(2, carStore.getNumberOfCarsInStore());

        carStore.addCar(new Car("Tesla", 100, 2018));
        Assertions.assertEquals(3, carStore.getNumberOfCarsInStore());
    }

    @Test
    public void getCarsSortedByYear() {

        CarStore carStore = new CarStore();
        carStore.addCar(new Car("Porsche", 1000, 2004));
        carStore.addCar(new Car("Volvo", 1200, 1993));
        carStore.addCar(new Car("Tesla", 100, 2018));

        carStore.sortCarsByYear();
        List<Car> cars = carStore.getCars();
        Assertions.assertEquals("Volvo", cars.get(0).getBrand());
        Assertions.assertEquals("Porsche", cars.get(1).getBrand());
        Assertions.assertEquals("Tesla", cars.get(2).getBrand());
    }

    @Test
    public void addNewCars() {
        CarStore carStore = new CarStore();
        int year = LocalDate.now().getYear();

        carStore.addNewCars(5, "Volvo", 0, year);
        Assertions.assertEquals(5, carStore.getNumberOfCarsInStore());

        carStore.addCar(new Car("Tesla", 100, 2018));
        Assertions.assertEquals(6, carStore.getNumberOfCarsInStore());
    }

}