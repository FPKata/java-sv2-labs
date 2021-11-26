package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {
    SalesAmountSumCalculator salesAmountSumCalculator = new SalesAmountSumCalculator();

    @Test
    void testSumSalesAmount(){
        List<Salesperson> salespersons = Arrays.asList(new Salesperson("A", 100),
                new Salesperson("B", 200),
                new Salesperson("C", 300),
                new Salesperson("D", 400));

        assertEquals(1000, salesAmountSumCalculator.sumSalesAmount(salespersons));
    }
}