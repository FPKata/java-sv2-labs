package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1;
        Person person2;
        person1 = new Person("John Doe", 55);
        person2 = person1;
        person2.setName("Enya");
        System.out.println("Person1 :" + person1);
        System.out.println("Person2 :" + person2);

        int num1 = 24;
        int num2;
        num2 = num1;
        num2 += 1;
        System.out.println("Num1 :" + num1);
        System.out.println("Num2 :" + num2);

    }
}
