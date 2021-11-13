package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayInMonthTest {
    DayInMonth dayInMonth = new DayInMonth();
    @Test
    void testGetDaysOfMonth(){
        assertEquals(30, dayInMonth.getDaysOfMonth(2021,"November"));
        assertEquals(31, dayInMonth.getDaysOfMonth(2021,"Május"));
        assertEquals(28, dayInMonth.getDaysOfMonth(2021,"Február"));
        assertEquals(29, dayInMonth.getDaysOfMonth(2000,"Február"));
        assertEquals(29, dayInMonth.getDaysOfMonth(2004,"Február"));
        assertEquals(0, dayInMonth.getDaysOfMonth(2004,"qwertz"));
        assertEquals(28, dayInMonth.getDaysOfMonth(1900,"Február"));
    }
}
