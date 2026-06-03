public class Main {
    public static void main(String[] args) {
        Library library = new Library("City Central Library");

        Book book1 = new Book("Effective Java", "Joshua Bloch", 3);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 2);
        Book book3 = new Book("Design Patterns", "Erich Gamma", 1);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Member member = new Member("Maya", "LIB-204");
        member.borrowBook(book1);
        member.borrowBook(book3);

        ReportPrinter printer = new ReportPrinter();
        printer.printLibraryReport(library, member);
    }
}
