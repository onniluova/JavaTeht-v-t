package src.Moduuli2.tehtavisto3.tehtava1;

public class LibraryMain {
    public static void main(String[] args) {
        Book book = new Book("Jakob", "Rämö Satu", 2003);
        Book book2 = new Book("36 uurnaa", "Kähkönen Sirpa", 2005);
        Library library = new Library();

        library.addBook(book);
        library.addBook(book2);
        library.displayBooks();
        library.findBooksByAuthor("Kähkönen Sirpa");
    }
}
