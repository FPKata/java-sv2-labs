package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What product is it?");
        String name = scanner.nextLine();

        System.out.println("What price is it?");
        int price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println(product.getName() + " " + product.getPrice());

        product.decreasePrice(29);
        System.out.println(product.getName() + " " + product.getPrice());

        product.increasePrice(39);
        System.out.println(product.getName() + " " + product.getPrice());

    }
}
