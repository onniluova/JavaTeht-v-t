package src.Moduuli3.tehtavisto3.tehtava2.library.model.system;

import src.Moduuli3.tehtavisto3.tehtava2.library.model.Book;
import src.Moduuli3.tehtavisto3.tehtava2.library.model.LibraryMember;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    ArrayList<LibraryMember> libraryMembers;

    public Library() {
        books = new ArrayList<>();
        libraryMembers = new ArrayList<>();
    }

    public void addMember(String name, int memberID) {
        LibraryMember newMember = new LibraryMember(name, memberID);
        libraryMembers.add(newMember);
    }
    public void addBook(String author) {
        int ISBN = 100 + (int) (Math.random()*400);
        Book newBook = new Book(author, ISBN);
        books.add(newBook);
    }

    public void borrowBook(LibraryMember member, Book book) {
        member.getBorrowedBooks().add(book);
        System.out.println(member.getName() + " borrowed " + book.getAuthor() + ", " + book.getISBN());
    }

    public void returnBook(LibraryMember member, Book book) {
        member.getBorrowedBooks().remove(book);
        System.out.println(member.getName() + " returned " + book.getAuthor() + ", " + book.getISBN());
    }

    public LibraryMember getMemberByID(int memberID) {
        for (LibraryMember member : libraryMembers) {
            if (member.getMemberID() == memberID) {
                return member;
            }
        }
        return null;
    }

    public Book getBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    public void reserveBook(LibraryMember member, Book book) {
        book.setReserved(true);
        System.out.println(member.getName() + " reserved " + book.getAuthor() + ", " + book.getISBN());
    }

    public void cancelReservation(LibraryMember member, Book book) {
        book.setReserved(false);
        System.out.println(member.getName() + " cancelled reservation of " + book.getAuthor() + ", " + book.getISBN());
    }

    public void displayReservedBooksForAMember(LibraryMember member) {
        for (Book book : books) {
            if (book.isReserved()) {
                System.out.println(member.getName() + " has reserved " + book.getAuthor() + ", " + book.getISBN());
            }
            else {
                System.out.println(member.getName() + " has not reserved anything");
            }
        }
    }
}
