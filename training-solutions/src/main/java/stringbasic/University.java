package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent){
        String studentNeptuneCode = student.getNeptunCode();
        String anotherStudentNeptunCode = anotherStudent.getNeptunCode();
        String studentID = student.getStudentID();
        String anotherStudentID = anotherStudent.getStudentID();

        return studentNeptuneCode.equals(anotherStudentNeptunCode) && studentID.equals(anotherStudentID);
    }
}
