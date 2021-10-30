package primitiveTypes.exam;

import java.time.LocalDate;

public class ExamRegistration {
    public static void main(String[] args) {
        Person person1 = new Person("name1", LocalDate.of(1234,1,12), 1111, 4.6);
        Person person2 = new Person("name2", LocalDate.of(2345,2,12), 2222, 3.5);
        Person person3 = new Person("name3", LocalDate.of(3456,3,12), 3333, 3.9);
        Exam exam = new Exam();
        exam.addPerson(person1);
        exam.addPerson(person2);
        exam.addPerson(person3);
        System.out.println(exam.getCheckedIns());
    }
}
