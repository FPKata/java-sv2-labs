package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabelsTest {
    @Test
    void testGetTableOfNumbers(){
        Labels labels = new Labels();
        int[][] table = labels.getTableOfNumbers(4);

        assertEquals(2, table[0][0]);
        assertEquals(5, table[1][2]);
        assertEquals(7, table[2][3]);
        assertEquals(8, table[3][3]);
    }
}
