package schoolrecords;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(List<Student> students) {
        this.students = students;
    }

    public boolean addStudent(){
        return true;
    }

    public boolean removeStudent(Student student){
        return true;
    }

    public double calculateClassAverage(){
        return 1.0;
    }

    public double calculateClassAverageBySubject(Subject subject){
        return 1.0;
    }

    public Student findStudentByName(String name){
        return null;
    }

    public Student repetition(){
        return null;
    }

    public List<StudyResultByName> listStudyResult(){
        return null;
    }

    public String listStudentNames(){
        for (Student actual : students){

        }
        return "";
    }

    public String getClassName() {
        return className;
    }
}
