package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem = new BillItem("PC", 100000, 5, 0.27);
        String product = billItem.getProduct();
        System.out.println("Product :" + product);
        int price = billItem.getPrice();
        System.out.println("Price :" + price);
        int quantity = billItem.getQuantity();
        System.out.println("Quantity :" + quantity);
        double vatPercent = billItem.getVatPercent();
        System.out.println("VAT :" + vatPercent);

        System.out.println("Total price :" + billItem.calculateTotalPrice(price, quantity, vatPercent));
    }
}
