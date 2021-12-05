package algorithmstransformation.students;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    private List<Person> persons;

    public PrimarySchool(List<Person> persons) {
        this.persons = persons;
    }

    public List<Student> getStudent(){
        List<Student> students = new ArrayList<>();
        for (Person actual : persons){
            if (actual.getAge() >= 6 && actual.getAge() <= 14){
                students.add(new Student(actual.getName(), actual.getAddress()));
            }
        }
        return students;
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    public List<Person> getPersons() {
        return persons;
    }
}
