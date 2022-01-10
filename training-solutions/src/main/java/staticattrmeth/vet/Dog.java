package staticattrmeth.vet;

public class Dog {
    private String name;
    private int age;
    private Species type;
    private long codeNumber;

    public Dog(String name, int age, Species type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Species getType() {
        return type;
    }

    public long getCodeNumber() {
        return codeNumber;
    }
    public void setCodeNumber(long codeNumber) {
        this.codeNumber = codeNumber;
    }
}
