package system;
import java.util.ArrayList;
import java.util.List;
import model.Book;
import model.LibraryMember;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book + " added to library \n");
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println(member + " added to library \n");
    }

    public void borrowBook(LibraryMember member, Book book) {
        member.addBorrovedBook(book);
        books.remove(book);
        book.setReserved(true);
        System.out.println(member + " borrowed " + book + " from the library");
    }

    public void returnBook(LibraryMember member, Book book) {
        member.removeBorrowedBook(book);
        addBook(book);
        System.out.println(member + " returned " + book + " from the library");
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isItAvailable()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not aveilable.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isItAvailable() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}