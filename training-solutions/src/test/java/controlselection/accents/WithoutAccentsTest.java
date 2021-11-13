package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {
    WithoutAccents withoutAccents = new WithoutAccents();
    @Test
    void testWith() {
        assertEquals('o', withoutAccents.getWithoutAccents('ö'));
        assertEquals('o', withoutAccents.getWithoutAccents('ő'));
        assertEquals('a', withoutAccents.getWithoutAccents('á'));
        assertEquals('u', withoutAccents.getWithoutAccents('ü'));
        assertEquals('u', withoutAccents.getWithoutAccents('ű'));
    }
    @Test
    void testWithout()
    {
        assertEquals('h', withoutAccents.getWithoutAccents('h'));
        assertEquals('g', withoutAccents.getWithoutAccents('g'));
    }
}
