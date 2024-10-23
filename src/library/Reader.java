package library;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private String surname;
    private List<BookCopy> listOfBorrowedBooks;

    public Reader (String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.listOfBorrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<BookCopy> getListOfBorrowedBooks() {
        return listOfBorrowedBooks;
    }

    public void setListOfBorrowedBooks(List<BookCopy> listOfBorrowedBooks) {
        this.listOfBorrowedBooks = listOfBorrowedBooks;
    }

    public void borrowedBook(BookCopy bookCopy) {
        if (!listOfBorrowedBooks.contains(bookCopy)) {
            listOfBorrowedBooks.add(bookCopy);
            System.out.println("You borrowed the book");
            System.out.println("Choose your next book");

        } else {
            System.out.println("The book is already borrowed.");
        }
    }

    public void returnedBook(BookCopy bookCopy) {
        if (listOfBorrowedBooks.contains(bookCopy)) {
            listOfBorrowedBooks.remove(bookCopy);
            System.out.println("You returned your book");
        } else {
            System.out.println("You cannot return a book you haven't borrowed.");
        }


    }
}
