package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Micimackó");
        System.out.println("Reference of object :" + book);
        System.out.println("Title : " + book.getTitle());
        book.setTitle("Tüskevár");
        System.out.println("New title : " + book.getTitle());
    }
}
