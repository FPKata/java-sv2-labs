package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDigitEvensTest {
    TwoDigitEvens evens = new TwoDigitEvens();

    @Test
    void testGetSum(){
        assertEquals(1980, evens.getSum());
    }

}