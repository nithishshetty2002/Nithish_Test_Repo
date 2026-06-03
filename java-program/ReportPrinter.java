public class ReportPrinter {
    public void printLibraryReport(Library library, Member member) {
        System.out.println("Library: " + library.getName());
        System.out.println("Total copies: " + library.getTotalCopies());
        System.out.println("Member: " + member.getName());
        System.out.println("Borrowed books:");
        for (Book book : member.getBorrowedBooks()) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}
