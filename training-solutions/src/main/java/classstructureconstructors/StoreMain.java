package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {

        Store store1 = new Store("coffee");
        System.out.println("Product1 :" + store1.getProduct() + " " + store1.getStock() + " " + "ton(s)");

        Store store2 = new Store("banana");
        System.out.println("Product2 :" + store2.getProduct() + " " + store2.getStock() + " " + "ton(s)");

        store1.store(11);
        store2.store(22);
        System.out.println("Product1 :" + store1.getProduct() + " " + store1.getStock() + " " + "ton(s)");
        System.out.println("Product2 :" + store2.getProduct() + " " + store2.getStock() + " " + "ton(s)");

        store1.dispatch(1);
        store2.dispatch(2);
        System.out.println("Product1 :" + store1.getProduct() + " " + store1.getStock() + " " + "ton(s)");
        System.out.println("Product2 :" + store2.getProduct() + " " + store2.getStock() + " " + "ton(s)");
    }
}
