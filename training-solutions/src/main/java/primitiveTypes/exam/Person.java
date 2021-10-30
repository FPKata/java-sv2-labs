package primitiveTypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private int zipcode;
    private double avgCredits;

    public Person(String name, LocalDate dateOfBirth, int zipcode, double avgCredits){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.zipcode = zipcode;
        this.avgCredits = avgCredits;
    }

    @Override
    public String toString() {
        return name + " (" + dateOfBirth + ") " + zipcode + ";   átlag: " + avgCredits + "\n";
    }

    public String getName(){
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getZipcode() {
        return zipcode;
    }

    public double getAvgCredits() {
        return avgCredits;
    }
}
