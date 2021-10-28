package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        //Tönbök és listák
        Book book11 = new Book();
        Book book12 = new Book();
        Book book13 = new Book();
        System.out.println("Tömb példányosított objektummal");
        Book[] booksArray = {book11, book12, book13};
        for (Book item : booksArray){
            System.out.print(item + ", ");
        }
        System.out.println();

        System.out.println("Lista példányosított objektummal");
        List<Book> booksList = Arrays.asList(book11, book12, book13);
        for (Book item : booksList){
            System.out.print(item + ", ");
        }
        System.out.println();

        System.out.println("Lista add metódussal feltöltve");
        List<Book> booksListAdd = new ArrayList<>();
        booksListAdd.add(book11);
        booksListAdd.add(book12);
        booksListAdd.add(book13);
        for (Book item : booksListAdd){
            System.out.print(item + ", ");
        }


        //Objektumok

//        new Book();  //nem tudok hozzáférni később
//        System.out.println(new Book());   //azt a mem. címet, ahol a példány tárolódik
//        System.out.println(new Book());
//        Book emptyBook = null;
//
//        System.out.println(emptyBook);
//        Book book = new Book();
//        System.out.println(book);
//        Book anotherBook = book;
//        System.out.println(anotherBook);
//        System.out.println(book == anotherBook);

        //Objektumok száma

//        Book book1 = new Book();
//        Book book2 = new Book();
//        Book book3 = new Book();
//        System.out.println("book1: " + book1);
//        System.out.println("book2: " + book2);
//        System.out.println("book3: " + book3);
//        Book book4 = book1;   //book1
//        System.out.println("book4: " + book4);
//
//        Book book5 = book1;   //book1
//        System.out.println("book5: " + book5);
//
//        Book book6 = book3;   //book3
//        System.out.println("book6: " + book6);
//
//        Book book7 = null;   //null
//        System.out.println("book7: " + book7);
//
//        book4 = book6;   //book3
//        System.out.println("book4: " + book4);
//
//        System.out.println("new Book(): " + new Book());   //új referencia
//
//        book5 = new Book();
//        System.out.println("book5: " + book5);   //új ref.
//
//        book6 = null;
//        System.out.println("book6: " + book6);   //null
//
//        book5 = book4;
//        System.out.println("book5: " + book5);   //book1
//        System.out.println();
//        System.out.println();
//        System.out.println("Na még egyszer elölről:");
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
//        System.out.println(book4);
//        System.out.println(book5);
//        System.out.println(book6);
//        System.out.println(book7);
    }
}
