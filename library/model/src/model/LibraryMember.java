package model;
import java.util.List;

public class LibraryMember {
    private String name;
    private int ID;
    private List<Book> borrowedBooks;

    public LibraryMember(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    String getName() {
        return name;
    }

    int getID() {
        return ID;
    }







}
