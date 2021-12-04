package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {
    @Test
    void testCreate(){
        FamilyMember familyMember = new FamilyMember("Kiss Mari", 28);

        assertEquals("Kiss Mari", familyMember.getName());
        assertEquals(28, familyMember.getAge());
    }
}