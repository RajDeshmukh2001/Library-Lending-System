public abstract class Member {
    int memberId;
    String name;
    int borrowedCount = 0;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public abstract int getBorrowLimit();
    public abstract int getFinePerDay();

    public boolean canBorrow() {
        return borrowedCount < getBorrowLimit();
    }
}
