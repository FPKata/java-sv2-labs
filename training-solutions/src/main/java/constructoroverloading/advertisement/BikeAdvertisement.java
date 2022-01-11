package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {
    private String description;
    private int price;
    private String brand;
    private List<String> extras;
    private String serialNumber;

    public BikeAdvertisement(String text, int price) {
        this.description = text;
        this.price = price;
    }

    public BikeAdvertisement(String text, int price, String type) {
        this(text, price);
        this.brand = type;
    }

    public BikeAdvertisement(String text, int price, String type, List<String> extras) {
        this(text, price, type);
        this.extras = extras;
    }

    public BikeAdvertisement(String text, int price, String type, List<String> extras, String serialNumber) {
        this(text, price, type, extras);
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public List<String> getExtras() {
        return extras;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
