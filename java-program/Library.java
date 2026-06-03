import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private final String name;
    private final List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public int getTotalCopies() {
        int total = 0;
        System.out.println(" - :" + total);
        for (Book book : books) {
            total += book.getCopies();
        }
        return total;
    }
}
