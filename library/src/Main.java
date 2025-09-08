import model.LibraryMember;
import model.Book;
import system.Library;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // kirjat

        Book book1 = new Book("Harry Potter", "JK Rowling");
        Book book2 = new Book("Auringon pelastaja", "Mikko Kuu");
        Book book3 = new Book("Kalevala", "Elias Lörnrot");
        Book book4 = new Book("Työmiehen vaimo", "Minna Canth");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);


        System.out.println("\nTervetuloa kirjastoon! Mikä on nimesi? ");
        LibraryMember member1 = new LibraryMember(scanner.nextLine());
        System.out.println("\nHei " + member1.getName() + "! sinun ID on: " + member1.getID());

        LibraryMember member2 = new LibraryMember("Kaneli");

        library.addMember(member1);

        library.borrowBook(member1, book4);
        library.returnBook(member1, book4);
        library.reserveBook(member2, book3);

        library.displayReservedBooks(member2);

        library.cancelReservation(member2, book4);



        scanner.close();


    }
}
