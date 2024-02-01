package src.Moduuli3.tehtavisto3.tehtava2.library.model;

import java.util.ArrayList;

public class LibraryMember {
    String name;
    int memberID;
    ArrayList<Book> borrowedBooks;

    public LibraryMember(String name, int memberID) {
        this.name = name;
        this.memberID = memberID;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getMemberID() {
        return this.memberID;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }
}
