package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public void risePrice(int percent){
        price *= (100 + percent) / 100.0;
    }

    public int comparePricePerCapacity(Pendrive other){
        double ppc = getPricePerCapacity();
        double otherPpc = other.getPricePerCapacity();
        int result = 0;
        if (ppc > otherPpc){
            result = 1;
        }else if (ppc < otherPpc){
            result = -1;
        }
        return result;
    }

    public double getPricePerCapacity(){
        return (double) price / capacity;
    }

    public  boolean isCheaperThan(Pendrive other){
        return price < other.price;
    }

    @Override
    public String toString() {
        return name + " : " + capacity + " GB, " + price + " Ft";
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

}
