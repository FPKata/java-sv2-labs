package isahasa.fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinerTest {

    @Test
    void testLoad() {
        Liner liner = new Liner(100);

        assertEquals(0, liner.loadPassengers(56));
        assertEquals(56, liner.getPassengers());
    }

    @Test
    void testLoadTooMuch() {
        Liner liner = new Liner(100);

        assertEquals(11, liner.loadPassengers(111));
        assertEquals(100, liner.getPassengers());
    }
}