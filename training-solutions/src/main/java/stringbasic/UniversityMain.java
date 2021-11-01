package stringbasic;

import java.util.List;

public class UniversityMain {
    public static void main(String[] args) {
        Person person1 = new Person("person1", "person1@gmail.com", "11",
                "11-11-11", "06-30-11");
        Student student1 = new Student(person1, "11", "1111");
        University uni = new University();
        Person person2 = new Person("person2", "person2@gmail.com", "22",
                "22-22-22", "06-30-22");
        Student student2 = new Student(person2, "22", "2222");
        Person person3 = new Person("person3", "person3@gmail.com", "11",
                "11-11-11", "06-30-11");
        Student student3 = new Student(person3, "11", "1111");

        student1.setEnteringCardNumber("ABC111");
        System.out.println(student1.getEnteringCardNumber());
        //különböző diák
        System.out.println(uni.areEqual(student1, student2));
        //ugyanaz a diák
        System.out.println(uni.areEqual(student1, student3));
        //lista diák nélkül
        List<Student> withoutStudents = uni.getStudents();
        System.out.println(withoutStudents);
        //lista diákkal
        uni.addStudent(student1);
        List<Student> withStudents = uni.getStudents();
        System.out.println(withStudents);
    }
}
