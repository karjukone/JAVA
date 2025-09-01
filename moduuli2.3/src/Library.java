
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayBooks() {
        int i = 1;
        for (Book b : books) {
            System.out.println(i++ + ". Title:  \"" + b.getTitle() + "\" Author: \"" + b.getAuthor() + "\" Publication year: " + b.getPublication());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\": ");
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: \"" + b.getTitle() + "\"");
            }
        }

    }

    public void borrowBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                books.remove(b);
                    System.out.println("\nBorrowed: \"" + title + "\"");
                    return;
                }

        }
        System.out.println("\nBook is not available in library");
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("\nReturned: \"" + book.getTitle() + "\"");
    }

    public boolean isBookAvailable(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }  return false;
    }

    public void getAverageRating() {
        double sum = 0;
        double count = 0;
        for (Book b : books) {
             double rating = b.getRating();

             if (rating > 0) {
                 sum += rating;
                 count++;
             }
        }
        System.out.println("The average rating of books is: " + sum / count);
    }

    public String getMostReviewedBook() {
        if (books.isEmpty()) return null;
        Book mostReviewed = books.get(0);
        for (Book b : books) {
            if (b.getReviews().size() > mostReviewed.getReviews().size()) {
                mostReviewed = b;
            }
        }

        String mostRe = mostReviewed.getTitle();

        return mostRe;
    }
}