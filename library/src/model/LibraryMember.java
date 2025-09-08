package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LibraryMember {
    private String name;
    private int ID;
    Random random = new Random();
    List<Book> borrowedBooks = new ArrayList<>();
    List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name) {
        this.name = name;
        this.ID = 100000 + random.nextInt(999999);
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void addBorrovedBook(Book book) {
        borrowedBooks.add(book);
    }

    public void removeBorrowedBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }

    @Override

    public String toString() {
        return "Käyttäjä: " + this.name + " ID: " + this.ID;
    }
}



