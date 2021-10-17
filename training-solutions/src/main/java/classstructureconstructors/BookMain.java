package classstructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        System.out.println("What is the author's name?");
        book.setAuthor(scanner.nextLine());
        System.out.println("What is the title of the book?");
        book.setTitle(scanner.nextLine());
        book.register("DRTZGHU");

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Registry number: " + book.getRegNumber());
    }
}
