package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testCreate(){
        Car car = new Car("Suzuki", "Swift", 2007);

        assertEquals("Suzuki", car.getBrand());
        assertEquals("Swift", car.getType());
        assertEquals(2007, car.getYearOfProduction());
    }

    @Test
    void testCreateWithNullName(){
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Car(null, "Swift", 2007));
        assertEquals("Brand cannot be empty", exception.getMessage());
    }

    @Test
    void testCreateWithEmptyName(){
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Car("", "Swift", 2007));
        assertEquals("Brand cannot be empty", exception.getMessage());
    }

    @Test
    void testCreateWithWrongYear(){
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Car("Suzuki", "Swift", 2050));
        assertEquals("Year of production must be in the past", exception.getMessage());
    }
}