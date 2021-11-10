package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {
//    @Test
//    public void testSayHelloWithName(){
//        //Given
//        String name = "John Doe";
//        //When
//        String greeting = new Gentleman().sayHello(name);
//        //Then
//        assertEquals("John Doe", greeting);
//
//    }

    @Test
    void testSayHelloWithNullName(){
        //Given
        String name = null;
        //When
        String greeting = new Gentleman().sayHello(name);
        //Then
        assertEquals("Hello Anonymous", greeting);
    }
}
