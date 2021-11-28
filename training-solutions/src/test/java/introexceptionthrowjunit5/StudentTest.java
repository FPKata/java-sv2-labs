package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student();

    @Test
    void testAddNote(){
        student.addNote(1);
        student.addNote(3);
        student.addNote(5);

        assertEquals(3, student.getNotes().size());
        assertEquals(5, student.getNotes().get(2));  //.intValue()
    }

    @Test
    void testAddNoteWithInvalid(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> student.addNote(11));
        assertEquals("Note must be between 1 and 5", iae.getMessage());
    }

}