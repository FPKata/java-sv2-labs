package collectionsequalshash;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String taj;

    public Person(String name, int age, String taj) {
        this.name = name;
        this.age = age;
        this.taj = taj;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTaj() {
        return taj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(taj);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Person person = (Person) obj;
        return Objects.equals(this.taj, person.taj);
    }


    public static void main(String[] args) {
        Person person = new Person("Kiss József", 45, "111111110");
        Person anotherPerson = new Person("Nagy Béla", 32, "111111110");

        System.out.println(person.equals(anotherPerson));
        System.out.println(anotherPerson.equals(person));

        System.out.println(person.hashCode());
        System.out.println(anotherPerson.hashCode());
    }
}
