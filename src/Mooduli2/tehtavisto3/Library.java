package src.Mooduli2.tehtavisto3;
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
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
}
