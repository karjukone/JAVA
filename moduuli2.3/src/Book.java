import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private int publication;
    private double rating;
    private ArrayList<String> reviews= new ArrayList<>();;

    Book(String title, String author, int publication) {
        this.title = title;
        this.author = author;
        this.publication = publication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublication() {
        return publication;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }


}
