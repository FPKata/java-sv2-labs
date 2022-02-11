package collectionslist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {

    @Test
    void testAddFlowerInTheMiddleEven() {
        BunchOfFlowers bunchOfFlowers = new BunchOfFlowers();
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlowerIntoTheBunch("tulipán");

        assertEquals("rózsa", bunchOfFlowers.getFlowers().get(1));
        assertEquals("tulipán", bunchOfFlowers.getFlowers().get(2));
        assertEquals("rózsa", bunchOfFlowers.getFlowers().get(3));
    }

    @Test
    void testAddFlowerInTheMiddleOdd() {
        BunchOfFlowers bunchOfFlowers = new BunchOfFlowers();
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlowerIntoTheBunch("tulipán");

        assertEquals("rózsa", bunchOfFlowers.getFlowers().get(1));
        assertEquals("tulipán", bunchOfFlowers.getFlowers().get(2));
        assertEquals("rózsa", bunchOfFlowers.getFlowers().get(3));
        assertEquals("tulipán", bunchOfFlowers.getFlowers().get(4));
        assertEquals("rózsa", bunchOfFlowers.getFlowers().get(5));
    }
}