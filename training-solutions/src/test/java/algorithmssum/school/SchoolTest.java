package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School school = new School();
    @Test
    void testGetNumberOfStudents(){
        List<Integer> headcounts = Arrays.asList(21, 23, 30, 22, 33, 18, 24, 25);
        assertEquals(196, school.getNumberOfStudents(headcounts));
    }

}