import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Member {
    private final String name;
    private final List<Book> borrowedBooks = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (book.borrowOneCopy()) {
            borrowedBooks.add(book);
        }
    }

    public List<Book> getBorrowedBooks() {
        return Collections.unmodifiableList(borrowedBooks);
    }
}
