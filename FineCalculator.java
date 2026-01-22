import java.time.temporal.ChronoUnit;

public class FineCalculator {

    public static int calculateFine(Member member, BorrowRecord record) {
        if (record.returnDate.isAfter(record.dueDate)) {
            long daysLate = ChronoUnit.DAYS.between(record.dueDate, record.returnDate);
            return (int) daysLate * member.getFinePerDay();
        }
        return 0;
    }
}
