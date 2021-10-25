package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> favouriteThings = new ArrayList<>();
        System.out.println("Your favourite film?");
        favouriteThings.add(scanner.nextLine());
        System.out.println("Your favourite country?");
        favouriteThings.add(scanner.nextLine());
        System.out.println("Your favourite dish?");
        favouriteThings.add(scanner.nextLine());
        System.out.println("Your favourite animal?");
        favouriteThings.add(scanner.nextLine());
        System.out.println("Your favourite book?");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Your favourite things:");
        for (String item : favouriteThings){
            System.out.print(item + ", ");
        }
    }
}
