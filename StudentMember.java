public class StudentMember extends Member {

    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    public int getBorrowLimit() {
        return 2;
    }

    public int getFinePerDay() {
        return 2;
    }
}
