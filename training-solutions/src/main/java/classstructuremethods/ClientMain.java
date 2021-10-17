package classstructuremethods;

import java.util.Scanner;
import java.lang.String;

public class ClientMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("What is your name?");
        client.setName(scanner.nextLine());
        System.out.println("What is your year of birth?");
        client.setYear(scanner.nextInt());
        scanner.nextLine();
        System.out.println("What is your address?");
        client.setAddress(scanner.nextLine());

        System.out.println("Your name: " + client.getName());
        System.out.println("Your year of birth: " + client.getYear());
        System.out.println("Your address: " + client.getAddress());

        client.migrate("New York");
        System.out.println("Your new address: " + client.getAddress());
    }
}
