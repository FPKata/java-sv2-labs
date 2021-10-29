package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Name", "ID");
        Address address = new Address("Country", "City", "Road and No");
        System.out.println("eredeti :" + person.getAddress());
        System.out.println(person);
        System.out.println("-------------------------------------------");
        person.moveTo(address);
        System.out.println("Address :" +person.getAddress());
        System.out.println("Person : " + person);
        System.out.println("-------------------------------------------");
        System.out.println("javított");
        person.correctData("Pista", "PO 2345");
        address.correctData("US", "Boston", "53rd 1234");
        System.out.println("Address :" +person.getAddress());
        System.out.println("Person : " + person);
        System.out.println("-------------------------------------------");
        System.out.println("új cím");
        Address anotherAddress = new Address("Hungary", "BP", "Villányi 11");
        System.out.println("1. move to nélkül :" + person.getAddress());
        person.moveTo(anotherAddress);
        System.out.println("2. move to-val :" + person.getAddress());
        System.out.println("-------------------------------------------");
        System.out.println("javított");
        person.getAddress().correctData("Uk", "London", "Hampton 2421");
        person.correctData("Klári", "AA 1122");
        System.out.println("Address :" + person.getAddress());
        System.out.println("Person : " + person);

    }
}
