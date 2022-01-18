package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    @Test
    void testNullNameShouldThrowException(){
        String name = null;
        SimpleTime begin = new SimpleTime(1, 1);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Course(name, begin));
        assertEquals("Name is null!", exception.getMessage());
    }

    @Test
    void testNullBeginShouldThrowException(){
        String name = "coursename";
        SimpleTime begin = null;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Course(name, begin));
        assertEquals("Time is null!", exception.getMessage());
    }

    @Test
    void testCreate(){
        String name = "coursename";
        SimpleTime begin = new SimpleTime(1, 1);
        Course course = new Course(name, begin);

        assertEquals(name, course.getName());
        assertEquals(begin, course.getBegin());
    }

    @Test
    void testToStringShouldReturnCorrectFormat(){
        String name = "coursename";
        String beginString = "12:05";
        SimpleTime begin = new SimpleTime(beginString);
        Course course = new Course(name, begin);

        assertEquals(String.format("%s:%s", beginString, name), course.toString());
    }
}