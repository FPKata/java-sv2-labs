package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private MarkType markType;
    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (name.isEmpty()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public void grading(Mark mark){
        if (mark != null){
            marks.add(mark);
        }else{
            throw new NullPointerException("Mark must not be null!");
        }
    }

    public double calculateAverage(){
        double sum = 0.0;
        int count = 0;
        double avg = 0.0;
        for (Mark actual : marks){
            sum += actual.getMarkType().value;
            count++;
        }
        if (count != 0){
            avg = sum / count;
        }
        return Math.round(avg * 100) / 100.0;
    }

    public double calculateSubjectAverage(Subject subject){
        double sum = 0.0;
        int count = 0;
        double avg = 0.0;
        for (Mark actual : marks){
            if (actual.getSubject().equals(subject)){
                sum += actual.getMarkType().value;
                count++;
            }
        }
        if (count != 0){
            avg = sum / count;
        }
        return Math.round(avg * 100) / 100.0;
    }

    //"Kovács marks: matematika: excellent(5)"
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Mark actual :marks){
            sb.append(name).append(" marks: ").append(actual.getSubject().getSubject()).append(": ")
                    .append(actual.getMarkType().text)
                    .append("(")
                    .append(actual.getMarkType().value)
                    .append(")");
            if (marks.size() > 1){
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
