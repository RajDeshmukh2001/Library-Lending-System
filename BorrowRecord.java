import java.time.LocalDate;

public class BorrowRecord {
    int bookId;
    int memberId;
    LocalDate borrowDate;
    LocalDate dueDate;
    LocalDate returnDate;

    public BorrowRecord(int bookId, int memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = LocalDate.now();
        this.dueDate = borrowDate.plusDays(7);
    }
}
