package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {
    @Test
    void testName(){
        Dragon dragon = new Dragon("Süsü", 1, 3.6);

        assertEquals("Süsü", dragon.getName());
        assertNotEquals("Sárkánykirály", dragon.getName());
    }

    @Test
    void testNumberOfHeads(){
        Dragon dragon = new Dragon("Süsü", 1, 3.6);

        assertEquals(1, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 1);
        assertFalse(dragon.getNumberOfHeads() == 7);
    }

    @Test
    void testHeight(){
        Dragon dragon = new Dragon("Süsü", 1, 3.6);

        assertEquals(3.6, dragon.getHeight(), 0.005);
    }

    @Test
    void testNull(){
        Dragon dragon = new Dragon("Süsü", 1, 3.6);
        Dragon dragon1 = null;

        assertNull(dragon1);
        assertNotNull(dragon);
    }

    @Test
    void testSameObjects(){
        Dragon dragon = new Dragon("Süsü", 1, 3.6);
        Dragon dragonNew = dragon;

        assertSame(dragon, dragonNew);
    }

    @Test
    void testNotSameObjects(){
        Dragon dragon = new Dragon("Süsü", 1, 3.6);
        Dragon dragonNew = new Dragon("Süsü", 1, 3.6);

        assertNotSame(dragon, dragonNew);
    }
}
