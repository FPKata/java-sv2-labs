package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void create() {
        ship = new Ship("Susie", 1999, 7.7);
    }

    @Test
    void testName(){
        assertEquals("Susie", ship.getName());
        assertNotEquals("Marge", ship.getName());
    }

    @Test
    void testYearOfConstruction(){
        assertEquals(1999, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1999);
        assertFalse(ship.getYearOfConstruction() == 2000);
    }

    @Test
    void testLength(){
        assertEquals(7.7, ship.getLength(), 0.005);
    }

    @Test
    void testNull(){
        Ship anotherShip;
        anotherShip = null;

        assertNull(anotherShip);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects(){
        Ship newShip;
        newShip = ship;
        assertSame(newShip, ship);
    }
}
