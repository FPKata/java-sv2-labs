package interfacedependencyinversion.vaccine;

public class Person {
    private String name;
    private int age;
    private ChronicDisease disease;
    private Pregnancy pregnant;

    public Person(String name, int age, ChronicDisease disease, Pregnancy pregnant) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.pregnant = pregnant;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ChronicDisease getDisease() {
        return disease;
    }

    public Pregnancy getPregnant() {
        return pregnant;
    }
}
