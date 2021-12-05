package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test
    void testGetSum(){
        Numbers numbers = new Numbers();

        assertEquals(10, numbers.getSum(new int[] {1, 2, 3, 4}));
        assertEquals(4, numbers.getSum(new int[] {4}));
        assertEquals(0, numbers.getSum(new int[] {}));
    }
}