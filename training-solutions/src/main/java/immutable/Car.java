package immutable;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String type;
    private int yearOfProduction;

    public Car(String brand, String type, int yearOfProduction) {
        if (brand == null || brand.isEmpty()){
            throw new IllegalArgumentException("Brand cannot be empty");
        }
        if (yearOfProduction > LocalDate.now().getYear()){
            throw new IllegalArgumentException("Year of production must be in the past");
        }
        this.brand = brand;
        this.type = type;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
