package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {
    @Test
    void testWithLowerClassChild(){
        PrimarySchoolChild primarySchoolChild = PrimarySchoolChild.of(7);

        assertEquals(LowerClassSchoolChild.class, primarySchoolChild.getClass());
    }

    @Test
    void testWithUpperClassSchoolChild(){
        PrimarySchoolChild primarySchoolChild = PrimarySchoolChild.of(13);

        assertEquals(UpperClassSchoolChild.class, primarySchoolChild.getClass());
    }

    @Test
    void testWithWrongAge(){

        Exception exception = assertThrows(IllegalArgumentException.class, () -> PrimarySchoolChild.of(99));
        assertEquals("Not proper age for a schoolchild!", exception.getMessage());
    }
}