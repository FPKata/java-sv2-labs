package schoolrecords;

import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> subjects;

    public Tutor(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        boolean taught = false;
        for (int i = 0; i < subjects.size() && !taught; i++){
            if (subject.getSubjectName().equals(subjects.get(i).getSubjectName())){
                taught = true;
            }
        }
        return taught;
    }
}
