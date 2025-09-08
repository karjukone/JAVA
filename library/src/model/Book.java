package model;
import java.util.Random;
import system.Library;


public class Book {
    String title;
    String author;
    int ISBN;
    Random random = new Random();
    private boolean reserved = false;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        ISBN = 10000 + random.nextInt(99999);
    }

    public String getTitle() {
        return title;
    }

    public boolean isItAvailable() {
        return reserved;
    }

    public void setReserved(boolean tila) {
        reserved = tila;
    }

    @Override
    public String toString() {
        return this.title + " by " + this.author;

    }





}
