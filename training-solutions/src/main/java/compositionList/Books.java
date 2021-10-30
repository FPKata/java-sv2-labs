package compositionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    private List<String> titles = new ArrayList<>();

    public void addBook(String title) {
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        //System.out.println("TEST: " + title + " | " + author);
        for (int i = 0; i < titles.size() - 1; i++) {
            System.out.println("TEST: " + titles.get(i) + " | " + i + " | " + titles.size());
            if (titles.get(i).equals(title)) {
                System.out.println(author + " : " + titles.get(i));
            }
        }
    }

    public List<String> getTitles(){
        return titles;
    }

    public static void main(String[] args) {
        Books books = new Books();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of books?");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfBooks; i++){
            System.out.println("Book " + (i + 1) + " :");
            books.addBook(scanner.nextLine());
        }
        System.out.println(books.getTitles());
        System.out.println("--------------------------------");
        books.findBookAndSetAuthor("first", "auth-1");
        books.findBookAndSetAuthor("ggg", "ggg-1");
        books.findBookAndSetAuthor("second", "auth-2");
        books.findBookAndSetAuthor("ddd", "ddd-2");
    }
}
