package algorithmstransformation.students;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testCreate(){
        Student student = new Student("Kiss Mari", "1111 Budapest Kő utca 11.");

        assertEquals("Kiss Mari", student.getName());
        assertEquals("1111 Budapest Kő utca 11.", student.getAddress());
    }
}