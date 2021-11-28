package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {
    Tank tank = new Tank(60);

    @Test
    void testModifyAngle(){
        tank.modifyAngle(-80);
        assertEquals(-20, tank.getAngle());
        tank.modifyAngle(50);
        assertEquals(30, tank.getAngle());
    }

    @Test
    void testModifyAngleWithWrongAngle(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> tank.modifyAngle(40));
        assertEquals("Cannot rotate that much", iae.getMessage());
    }
}