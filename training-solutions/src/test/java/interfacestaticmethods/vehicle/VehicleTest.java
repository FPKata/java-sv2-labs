package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void testOfWithBicycle(){
        Vehicle vehicle = Vehicle.of(2);

        assertEquals(Bicycle.class, vehicle.getClass());
    }

    @Test
    void testOfWithCar(){
        Vehicle vehicle = Vehicle.of(4);

        assertEquals(Car.class, vehicle.getClass());
    }

    @Test
    void testWithWrongParameter(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Vehicle.of(11));
        assertEquals("Not proper number of wheels for a vehicle!", exception.getMessage());
    }
}