package linebreak;

public class Car {
    private String brand;
    private String types;

    public Car(String brand, String types){
        this.brand = brand;
        this.types = types;
    }

    public String getBrandAndTypeInSeparatedLines(){
        return brand + "\n" + types;
    }

    public static void main(String[] args) {
        Car car = new Car("Trabant", "Hycomat");
        System.out.println(car.getBrandAndTypeInSeparatedLines());
    }
}
