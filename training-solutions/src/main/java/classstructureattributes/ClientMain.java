package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("What is your name?: ");
        String name = scanner.nextLine();

        System.out.println("Year of birth?: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your address?: ");
        String address = scanner.nextLine();

        client.name = name;
        client.yearOfBirth = yearOfBirth;
        client.address = address;

        System.out.println("Name: " + client.name);
        System.out.println("YearOfBirth: " + client.yearOfBirth);
        System.out.println("Address: " + client.address);

    }
}
