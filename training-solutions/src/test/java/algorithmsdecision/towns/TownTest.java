package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {
    @Test
    void testContainsFewerHabitants(){
        Town towns = new Town();
        List<Integer> list = Arrays.asList(1200, 3456, 432, 765, 1001, 5555);

        assertTrue(towns.containsFewerHabitants(list, 1000));
        assertFalse(towns.containsFewerHabitants(list, 100));
    }
}