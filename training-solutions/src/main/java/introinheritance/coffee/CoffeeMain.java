package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Omnia");
        coffee.setPrice(1200);
        System.out.println("Name of coffee: " + coffee.getName());
        System.out.println("Price of coffee: " + coffee.getPrice());
        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("La festa");
        cappuccino.setPrice(500);
        System.out.println("Name of cappuccino: " + cappuccino.getName());
        System.out.println("Price of cappuccini: " + cappuccino.getPrice());
    }
}
