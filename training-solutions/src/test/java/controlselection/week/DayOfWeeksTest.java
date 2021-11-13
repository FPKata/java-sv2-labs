package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeeksTest {
    DayOfWeeks dayOfWeeks = new DayOfWeeks();

    @Test
    void testGetDayOfWeeks(){
        assertEquals("hét eleje", dayOfWeeks.getDayOfWeeks("Hétfő"));
        assertEquals("hét közepe", dayOfWeeks.getDayOfWeeks("szerda"));
        assertEquals("majdnem hétvége", dayOfWeeks.getDayOfWeeks("Péntek"));
        assertEquals("hétvége", dayOfWeeks.getDayOfWeeks("SZOMBAT"));
        assertEquals("ismeretlen nap", dayOfWeeks.getDayOfWeeks("boci"));
    }
}
