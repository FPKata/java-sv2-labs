package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song favourite = new Song();

        System.out.println("Your favourite singer / band?");
        String band = scanner.nextLine();
        System.out.println("Your favourite song?");
        String title = scanner.nextLine();
        System.out.println("How long is it? (in minutes)");
        int length = scanner.nextInt();

        favourite.band = band;
        favourite.title = title;
        favourite.length = length;

        System.out.println("Your favourite singer / band is " + favourite.band);
        System.out.println("Your favourite song is " + favourite.title);
        System.out.println("Your favourite song is " + favourite.length + " minutes long");


    }
}
