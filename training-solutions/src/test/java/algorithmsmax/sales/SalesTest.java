package algorithmsmax.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    List<Salesperson> salespersons = Arrays.asList(
            new Salesperson("Kis Pál", 10000, 18000),
            new Salesperson("Nagy Mónika", 16000, 12000),
            new Salesperson("Kovács Samu", 14000, 6000),
            new Salesperson("Tóth Gábor", 13000, 10000),
            new Salesperson("Ágh Bettina", 25000, 35000 ));

    @Test
    void testSelectSalesPersonWithMaxSalesAmount(){
        Sales sales = new Sales();
        assertEquals(25000, sales.selectSalesPersonWithMaxSalesAmount(salespersons).getAmount());
        assertEquals(35000, sales.selectSalesPersonWithMaxSalesAmount(salespersons).getTarget());
    }

    @Test
    void testSelectSalesPersonWithFurthestAboveTarget(){
        Sales sales = new Sales();

        assertEquals(14000, sales.selectSalesPersonWithFurthestAboveTarget(salespersons).getAmount());
        assertEquals(6000, sales.selectSalesPersonWithFurthestAboveTarget(salespersons).getTarget());
    }

    @Test
    void testSelectSalesPersonWithFurthestBelowTarget(){
        Sales sales = new Sales();

        assertEquals(25000, sales.selectSalesPersonWithFurthestBelowTarget(salespersons).getAmount());
        assertEquals(35000, sales.selectSalesPersonWithFurthestBelowTarget(salespersons).getTarget());
    }
}