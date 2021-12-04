package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    Family family = new Family();

    @Test
    void testGetAgesOfFamilyMembersWithNameGiven(){
        family.addFamilyMember(new FamilyMember("Ó Éva", 77));
        family.addFamilyMember(new FamilyMember("Nagy Pista", 80));
        family.addFamilyMember(new FamilyMember("Nagy Mari", 50));
        family.addFamilyMember(new FamilyMember("Ó Iza", 66));
        family.addFamilyMember(new FamilyMember("Ó Pista", 70));
        family.addFamilyMember(new FamilyMember("Ó Béla", 71));
        family.addFamilyMember(new FamilyMember("Ó Mari", 72));
        family.addFamilyMember(new FamilyMember("Kiss Mari", 45));

        List<Integer> withAge = family.getAgesOfFamilyMembersWithNameGiven("Mari");
        assertEquals(3, withAge.size());
        assertTrue(withAge.contains(45));
        assertFalse(withAge.contains(77));
    }
}