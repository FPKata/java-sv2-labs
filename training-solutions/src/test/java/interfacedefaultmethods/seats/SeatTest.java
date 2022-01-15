package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {
    @Test
    void testFamilyCar(){
        FamilyCar familyCar = new FamilyCar();

        assertEquals(5, familyCar.getNumberOfSeats());
    }

    @Test
    void testSportsCar(){
        SportsCar sportsCar = new SportsCar();

        assertEquals(2, sportsCar.getNumberOfSeats());
    }

    @Test
    void testCar(){
        Car car = new Car("Opel Corsa", 4);

        assertEquals("Opel Corsa", car.getBrand());
        assertEquals(4, car.getNumberOfSeats());
    }
}