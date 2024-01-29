package src.Mooduli2.tehtavisto3.tehtava4;

public class LibraryMain {
    public static void main(String[] args) {
        Book book = new Book("Jakob", "Rämö Satu", 2003);
        Book book2 = new Book("36 uurnaa", "Kähkönen Sirpa", 2005);
        Library library = new Library();

        library.addBook(book);
        library.addBook(book2);
        library.setRating("Jakob", 4);
        library.setReview("Jakob", "Hyvä kirja.");
        library.displayBooks();
    }
}
