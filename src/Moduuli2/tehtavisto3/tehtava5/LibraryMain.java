package src.Moduuli2.tehtavisto3.tehtava5;

public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Jakob", "Rämö Satu", 2003);
        Book book2 = new Book("36 uurnaa", "Kähkönen Sirpa", 2005);
        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.setRating("Jakob", 4);
        library.setReview("Jakob", "Hyvä kirja.");
        library.setRating("36 uurnaa", 4.5);
        library.setReview("36 uurnaa", "Hyvä");
        library.setRating("36 uurnaa", 4.2);
        library.setReview("36 uurnaa", "Aika hyvä");

        Book mostReviewedBook = library.getMostReviewedBook();
        if (mostReviewedBook != null) {
            System.out.println("Eniten arvosteltu kirja: " + mostReviewedBook.getTitle());
        } else {
            System.out.println("Ei arvosteluja.");
        }

        double averageRating = library.getAverageBookRating();
        System.out.println("Kirjojen keskiarvo: " + averageRating);
    }
}