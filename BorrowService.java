import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BorrowService {

    private final List<BorrowRecord> records = new ArrayList<>();
    private final LibraryService library;

    public BorrowService(LibraryService library) {
        this.library = library;
    }

    public void borrowBook(int memberId, int bookId) {

        Member member = library.getMember(memberId);
        Book book = library.getBook(bookId);

        if (member == null || book == null) {
            System.out.println("Invalid member or book.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book not available.");
            return;
        }

        if (!member.canBorrow()) {
            System.out.println("Borrow limit reached.");
            return;
        }

        book.borrowCopy();
        member.borrowedCount++;

        records.add(new BorrowRecord(bookId, memberId));
        System.out.println("Book borrowed successfully.");
    }

    public void returnBook(int memberId, int bookId) {

        for (BorrowRecord r : records) {

            if (r.bookId == bookId && r.memberId == memberId && r.returnDate == null) {

                r.returnDate = LocalDate.now();

                Book book = library.getBook(bookId);
                Member member = library.getMember(memberId);

                book.returnCopy();
                member.borrowedCount--;

                int fine = FineCalculator.calculateFine(member, r);
                System.out.println("Book returned. Fine: ₹" + fine);
                return;
            }
        }

        System.out.println("Borrow record not found.");
    }
}
