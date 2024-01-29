package src.Mooduli2.tehtavisto3.tehtava5;

import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks() {
        System.out.println("Library catalog: ");
        int luku = 0;
        for(Book book : books) {
            luku+= 1;
            System.out.print(luku + ". ");
            System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getPublicationYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Kirjoja tekijältä " + author + ": ");
        for(Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getTitle() + " (" + book.getPublicationYear() + ")");
            }
        }
    }

    public void borrowBook(String title) {
        for(Book book : books) {
            if (book.getTitle().equals(title)) {
                borrowedBooks.add(book);
                books.remove(book);
                System.out.println("Lainasit kirjan " + book.getTitle());
            }
            else  {
                System.out.println("Kirjaa ei voitu lainata.");
            }
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            books.add(book);
            borrowedBooks.remove(book);
            System.out.println("Palautit kirjan " + book.getTitle());
        }
        else  {
            System.out.println("Kirjaa ei voitu palauttaa");
        }
    }

    public void isBookAvailable(String title) {
        for(Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("Kirja " + book.getTitle() + " löytyy kirjastosta.");
            }
        }
    }

    public void setRating(String title, double rating) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setRating(rating);
                System.out.println("Arviointi asetettu " + title + ": " + rating);
                return;
            }
        }
        for (Book book : borrowedBooks) {
            if (book.getTitle().equals(title)) {
                book.setRating(rating);
                System.out.println("Arviointi asetettu " + title + ": " + rating);
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void setReview(String title, String review) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setReview(review);
                System.out.println("Arviointi asetettu " + title + ": " + review);
                book.addReview();
                return;
            }
        }
        for (Book book : borrowedBooks) {
            if (book.getTitle().equals(title)) {
                book.setReview(review);
                System.out.println("Arviointi asetettu " + title + ": " + review);
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0;
        }
        double totalRating = 0;
        int count = 0;
        for (Book book : books) {
            totalRating += book.getRating();
            count++;
        }
        for (Book book : borrowedBooks) {
            totalRating += book.getRating();
            count++;
        }
        return totalRating / count;
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty() && borrowedBooks.isEmpty()) {
            return null;
        }
        Book mostReviewedBook = null;
        int maxReviews = 0;
        for (Book book : books) {
            if (book.getNumberOfReviews() > maxReviews) {
                mostReviewedBook = book;
                maxReviews = book.getNumberOfReviews();
            }
        }
        for (Book book : borrowedBooks) {
            if (book.getNumberOfReviews() > maxReviews) {
                mostReviewedBook = book;
                maxReviews = book.getNumberOfReviews();
            }
        }
        return mostReviewedBook;
    }
}
