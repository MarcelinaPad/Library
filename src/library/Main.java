package library;

public class Main {
    public static void main(String[] args) {
        BookCopy book = new BookCopy("King", "IT", 1998, 354);
        System.out.println(book.descriptionOfBook());

        Reader reader = new Reader("Kotek", "Kotkowski");

        reader.borrowedBook(book);
        reader.borrowedBook(book);
        reader.returnedBook(book);
        reader.borrowedBook(book);


    }
}
