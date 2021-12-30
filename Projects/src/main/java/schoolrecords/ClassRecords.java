package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        if (validateStrings(className)){
            this.className = className;
        }else{
            throw new IllegalArgumentException("Classname is not proper!");
        }
        this.random = random;
    }

    public boolean validateStrings(String string){
        boolean isvalid = true;
        if (string == null || string.isEmpty()){
            isvalid = false;
        }
        return isvalid;
    }

    public boolean addStudent(Student student){
        boolean isInClass = getIndex(student) > -1;
        boolean succeeded = false;
        if (!isInClass){
            students.add(student);
            succeeded = true;
        }
        return succeeded;
    }

    public int getIndex(Student student){
        int index = -1;
        for (int i = 0; i < students.size() && index == -1; i++){
            if (students.get(i).getName().equals(student.getName())){
                index = i;
            }
        }
        return index;
    }

    public boolean removeStudent(Student student){
        boolean removed = false;
        int index = getIndex(student);
        if ( index > -1){
            students.remove(index);
            removed = true;
        }
        return removed;
    }

    public double calculateClassAverage(){
        if (students.size() == 0){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        double sumClassAverage = 0;
        int count = 0;
        for (Student actual : students){
            sumClassAverage += actual.calculateAverage();
            if (actual.calculateAverage() > 0.00001){
                count++;
            }
        }
        if (count == 0){
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return Math.round((sumClassAverage / count) * 100) / 100.0;
    }

    public double calculateClassAverageBySubject(Subject subject){
        double sumSubjectAverage = 0.0;
        int count = 0;
        for (Student actual : students){
            sumSubjectAverage += actual.calculateSubjectAverage(subject);
            if (actual.calculateSubjectAverage(subject) > 0.00001){
                count++;
            }
        }
        return Math.round(sumSubjectAverage / count * 100) / 100.0;
    }

    public Student findStudentByName(String name){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.isEmpty()){
            throw new IllegalStateException("No students to search!");
        }
        for (Student actual : students){
            if (actual.getName().equals(name)){
                return actual;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! Kiss Rita");
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
