package composition.realestate;

public class Address {
    private String city;
    private String zipcode;
    private String street;
    private int houseNumber;

    public Address(String city, String zipcode, String street, int houseNumber){
        this.city = city;
        this.zipcode = zipcode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String toString(){
        return "Elhelyezkedés : " + zipcode + "  " + city + " " + street + " út " + houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
