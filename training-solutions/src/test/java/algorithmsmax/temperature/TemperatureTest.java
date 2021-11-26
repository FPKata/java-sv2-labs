package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    Temperature temperature = new Temperature();
    @Test
    void testGetMin(){
        List<Integer> list = Arrays.asList(-6, 12, 0, 54, -66, 7, 94);

        assertEquals(-66, temperature.getMin(list));
    }
}