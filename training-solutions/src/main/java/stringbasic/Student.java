package stringbasic;

import java.util.List;

public class Student {
    private Person person;
    private String neptunCode;
    private String studentID;
    private String enteringCardNumber;

    public Student(Person person, String neptunCode, String studentID) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.studentID = studentID;
    }

    public Person getPerson() {
        return person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getEnteringCardNumber() {
        return enteringCardNumber;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setEnteringCardNumber(String enteringCardNumber) {
        this.enteringCardNumber = enteringCardNumber;
    }
}
