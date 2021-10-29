package composition.person;

public class Person {
    private String name;
    private String identificationCard;
    private Address address;

    public Person(String name, String identificationCard){
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void correctData(String name, String identificationCard){
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void moveTo(Address address){
        this.address = address;
    }

    @Override
    public String toString() {
        return getName() + "  " + getIdentificationCard();
    }

    public Address getAddress(){
        return address;
    }

    public String getName(){
        return name;
    }

    public String getIdentificationCard(){
        return identificationCard;
    }

}
