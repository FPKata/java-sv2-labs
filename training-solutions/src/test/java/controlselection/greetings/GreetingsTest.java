package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {
    @Test
    void testGreetings(){
        Greetings greetings = new Greetings();
        assertEquals("Jó éjt!", greetings.sayGreeting(5,0));
        assertEquals("Jó reggelt!", greetings.sayGreeting(5,1));
        assertEquals("Jó reggelt!", greetings.sayGreeting(9,0));
        assertEquals("Jó napot!", greetings.sayGreeting(9,1));
        assertEquals("Jó napot!", greetings.sayGreeting(18,30));
        assertEquals("Jó estét!", greetings.sayGreeting(18,31));
        assertEquals("Jó estét!", greetings.sayGreeting(20,0));
        assertEquals("Jó éjt!", greetings.sayGreeting(20,1));
    }

}
