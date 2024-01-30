package src.Moduuli2.tehtavisto3.tehtava5;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private String review;
    private int numberOfReviews;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.rating = 0;
        this.review = review;
        this.numberOfReviews = 0;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }

    public double getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }


    public void addReview() {
        this.numberOfReviews++;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setRating(double rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Virheellinen arvio. Anna luku 1-5 välillä.");
        }
    }
    public void setReview(String review) {
        this.review = review;
    }
}
