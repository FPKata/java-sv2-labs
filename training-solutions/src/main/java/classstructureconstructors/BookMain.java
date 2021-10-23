package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Orwell","Animal farm");
        Book book2 = new Book("Milne","Winnie the Pooh");

        book1.register("DRTZGHU");
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Registry number: " + book1.getRegNumber());

        book2.register("ASDFGHJ");
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Registry number: " + book2.getRegNumber());
    }
}
