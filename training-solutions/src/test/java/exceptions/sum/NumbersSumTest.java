package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {
    NumbersSum numbersSum = new NumbersSum();

    @Test
    void testGetSumWithInts(){
        assertEquals(22, numbersSum.getSum(new int[]{20, 0, -5, 7 ,12, -10, -2}));
    }

    @Test
    void testGetSumWithString(){
        assertEquals(32, numbersSum.getSum(new String[]{"12", "3", "-2", "11", "8"}));
    }

    @Test
    void testGetSumWithIntsWithNullParameter(){
        int[] numbers = null;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(numbers));
        assertEquals("Parameter should not be null!", exception.getMessage());
    }

    @Test
    void testGetSumWithStringWithNullParameter(){
        String[] numbers = null;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(numbers));
        assertEquals("Parameter should not be null!", exception.getMessage());
    }

    @Test
    void testGetSumWithStringWithIllegalNumbers(){
        String[] numbers = new String[]{"1", "2", "a", "3"};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(numbers));
        assertEquals("Illegal numbers!", exception.getMessage());
    }
}