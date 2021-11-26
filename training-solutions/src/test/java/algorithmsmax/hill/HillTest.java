package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {
    Hill hill = new Hill();
    @Test
    void testGetMax(){
        List<Integer> hilltops = Arrays.asList(1020, 3, 56, 657, 659, 1430);

        assertEquals(1430, hill.getMax(hilltops));
    }
}