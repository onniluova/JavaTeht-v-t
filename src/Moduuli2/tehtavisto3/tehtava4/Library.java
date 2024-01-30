package src.Moduuli2.tehtavisto3.tehtava4;

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
}
