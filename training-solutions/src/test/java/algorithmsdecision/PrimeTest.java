package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    @Test
    void testNumberIsPrime(){
        Prime prime = new Prime();
        assertTrue(prime.isPrime(23));
        assertFalse(prime.isPrime(16));
        assertFalse(prime.isPrime(0));
        assertFalse(prime.isPrime(1));
    }

}