package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<BookCopy> listOfBooks = new ArrayList<>();
    List<BookCopy> borrowedBooks = new ArrayList<>();

    public void addBook(BookCopy bookCopy) {
        if (!listOfBooks.contains(bookCopy)) {
            listOfBooks.add(bookCopy);
            System.out.println(bookCopy.getTitle() + " has been added");
        } else {
            System.out.println("The library already has " + bookCopy.getTitle());
        }
    }

    public void removeBook(BookCopy bookCopy) {
        if (listOfBooks.contains(bookCopy) && !borrowedBooks.contains(bookCopy)) {
            listOfBooks.remove(bookCopy);
            System.out.println(bookCopy.getTitle() + " has been removed");
        } else if (borrowedBooks.contains(bookCopy)) {
            System.out.println(bookCopy.getTitle() + " cannot be removed because is currently borrowed");
        } else {
            System.out.println("The library doesn't have " + bookCopy.getTitle());
        }
    }

    public void borrowedTheBook(Reader reader, BookCopy bookCopy) {
        if (listOfBooks.contains(bookCopy) && !borrowedBooks.contains(bookCopy)) {
            reader.borrowedBook(bookCopy);
            borrowedBooks.add(bookCopy);
            listOfBooks.remove(bookCopy);
            System.out.println("You borrowed the " + bookCopy.getTitle());
        } else if (borrowedBooks.contains(bookCopy)) {
            System.out.println(bookCopy.getTitle() + " is already borrowed");

        } else {
            System.out.println(bookCopy.getTitle() + " is not available for you");
        }
    }

    public void returnBook(BookCopy bookCopy) {
        if (borrowedBooks.contains(bookCopy)) {
            borrowedBooks.remove(bookCopy);
            listOfBooks.add(bookCopy);
            System.out.println("You returned the " + bookCopy.getTitle());
        } else {
            System.out.println(bookCopy.getTitle() + " is not borrowed");
        }
    }

}
