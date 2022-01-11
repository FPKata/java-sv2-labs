//package methodstructure.bmi;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class BodyMassTest {
//    @Test
//    void testCreate(){
//        BodyMass bodyMass = new BodyMass(45, 1.6);
//
//        assertEquals(45, bodyMass.getWeight());
//        assertEquals(1.6, bodyMass.getHeight());
//    }
//    @Test
//    void testGetBodyMassIndex(){
//        BodyMass bodyMass = new BodyMass(40.96, 1.6);
//
//        assertEquals(16, bodyMass.getBodyMassIndex(), 0.0005);
//    }
//
//    @Test
//    void testGetBody(){
//        BodyMass bodyMassNorm = new BodyMass(56.32, 1.6);
//        BodyMass bodyMassUnder = new BodyMass(40.96, 1.6);
//        BodyMass bodyMassOver = new BodyMass(76.8, 1.6);
//
//        assertEquals(BmiCategory.NORMAL, bodyMassNorm.getBody());
//        assertEquals(BmiCategory.UNDERWEIGHT, bodyMassUnder.getBody());
//        assertEquals(BmiCategory.OVERWEIGHT, bodyMassOver.getBody());
//    }
//
//    @Test
//    void testIsThinnerThan(){
//        BodyMass bodyMassNorm = new BodyMass(56.32, 1.6);
//        BodyMass bodyMassUnder = new BodyMass(40.96, 1.6);
//        BodyMass bodyMassOver = new BodyMass(76.8, 1.6);
//
//        assertTrue(bodyMassNorm.isThinnerThan(bodyMassOver));
//        assertFalse(bodyMassNorm.isThinnerThan(bodyMassUnder));
//    }
//}