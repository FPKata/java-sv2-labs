package composition.person;

public class Address {
    private String country;
    private String city;
    private String roadAndNumber;


    public Address(String country, String city, String roadAndNumber) {
        this.country = country;
        this.city = city;
        this.roadAndNumber = roadAndNumber;
    }

    public void correctData(String country, String city, String roadAndNumber){
        this.country = country;
        this.city = city;
        this.roadAndNumber = roadAndNumber;
    }

    @Override
    public String toString() {
        return getCountry() + "  " + getCity() + "  " + getRoadAndNumber();
    }

    public String getCountry () {
        return country;
    }

    public String getCity(){
        return city;
    }

    public String getRoadAndNumber(){
        return roadAndNumber;
    }

}
