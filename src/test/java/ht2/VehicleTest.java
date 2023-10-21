package ht2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VehicleTest {

    @Test //  - проверка, что экземпляр объекта Car также является экземпляром транспортного средства (instanceof)
    public void carIsInstanceOfVehicle() {
        Car car = new Car("Ford", "Focus", 2003);
        assertEquals(car.getClass().getSuperclass().getTypeName(), Vehicle.class.getName());
    }

    @Test //  - проверка, что объект Car создается с 4 колесами
    public void carHasFourWheels() {
        Car car = new Car("Ford", "Focus", 2003);
        assertEquals(car.getNumWheels(), 4);
    }

    @Test //  - проверка, что объект Motorcycle создается с 2 колесами
    public void motorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Иж", "Юпитер", 1990);
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test //  - проверка, что объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    public void carReachesSpeedOfSixtyInTestDrivenMode() {
        Car car = new Car("Ford", "Focus", 2003);
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test //  - проверка, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    public void motorcycleReachesSpeedOfSeventyFiveInTestDrivenMode() {
        Motorcycle motorcycle = new Motorcycle("Иж", "Юпитер", 1990);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test //  - проверка, что в режиме парковки после testDrive() машина останавливается (speed = 0)
    public void isCarStopped() {
        Car car = new Car("Ford", "Focus", 2003);
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test //  - проверка, что в режиме парковки после testDrive() мотоцикл останавливается (speed = 0)
    public void isMotorcycleStopped() {
        Motorcycle motorcycle = new Motorcycle("Иж", "Юпитер", 1990);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}
