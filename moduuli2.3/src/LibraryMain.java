public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "JK. Rowling", 2000);
        Book book2 = new Book("Pride and prejudice", "Jane Austin", 1813);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book4 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book5 = new Book("Harry Potter 2", "JK. Rowling", 2001);
        Library metso = new Library();

        User user1 = new User("Keke", 15);
        metso.addUser(user1);
        User user2 = new User("Vilma",36);
        metso.addUser(user2);
        user1.borrowBook(book5);
        user2.borrowBook(book3);

        metso.addBook(book1);
        metso.addBook(book2);
        metso.addBook(book3);
        metso.addBook(book4);
        metso.addBook(book5);

        metso.displayBooks();
        metso.findBooksByAuthor("JK. Rowling");

        metso.borrowBook("The Great Gatsby");
        System.out.println("\nIs the great gatsby available? : " + metso.isBookAvailable("The Great Gatsby"));
        System.out.println("\nIs Harry Potter? : " + metso.isBookAvailable("Harry Potter"));
        metso.returnBook(book3);

        book1.setRating(3.5);
        book5.setRating(5);
        book4.setRating(4);
        book2.setRating(2);

        System.out.println("\n" + book1.getTitle() + " gets rating of: " + book1.getRating());
        System.out.println("\n" + book5.getTitle() + " gets rating of: " + book5.getRating());
        System.out.println("\n" + book4.getTitle() + " gets rating of: " + book4.getRating());
        System.out.println("\n" + book2.getTitle() + " gets rating of: " + book2.getRating());
        book4.addReview("Would read again");
        book4.addReview("Good");
        book2.addReview("Very thougtfull");
        System.out.println("\n" + book4.getTitle() + " gets new rewiev: " + book4.getReviews());

        metso.getAverageRating();
        System.out.println("Most rewieved book is: " + metso.getMostReviewedBook());



    }
}
