package intromethods.registration;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private String email;

    public  Person(String name, LocalDate dateOfBirth, String email){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String toString(){
        return "Name : " + name + "\n" +  "Date of birth : " + dateOfBirth + "\n" + "E-mail : " + email;
    }

    public  String getName(String  name){
        return name;
    }

    public  LocalDate getDateOfBirth(LocalDate dateOfBirth){
        return dateOfBirth;
    }

    public  String getEmail(String email){
        return email;
    }
}
