package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {
    @Test
    void testCreate(){
        Salesperson salesperson =new Salesperson("John Doe", 100);
        assertEquals("John Doe", salesperson.getName());
        assertEquals(100, salesperson.getAmount());
    }

}