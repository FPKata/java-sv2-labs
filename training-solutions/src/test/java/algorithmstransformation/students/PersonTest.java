package algorithmstransformation.students;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testCreate(){
        Person person = new Person("Kiss Mari", 55, "4060 Debrecen Hatvan utca 44.");

        assertEquals("Kiss Mari", person.getName());
        assertEquals(55, person.getAge());
        assertEquals("4060 Debrecen Hatvan utca 44.", person.getAddress());
    }
}