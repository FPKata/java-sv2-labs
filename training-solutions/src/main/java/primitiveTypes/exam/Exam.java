package primitiveTypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Person> checkedIns = new ArrayList<>();

    public void addPerson(Person person){
        checkedIns.add(person);
    }

    public List<Person> getCheckedIns() {
        return checkedIns;
    }
}
