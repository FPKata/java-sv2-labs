package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {
    Height height = new Height();
    @Test
    void testCountChildrenWithHeightThan(){
        List<Integer> heights = Arrays.asList(111, 123, 145, 100, 137, 119, 125, 144, 160);
        assertEquals(6, height.countChildrenWithHeightThan(heights, 120));
    }
}