public class RegularMember extends Member {

    public RegularMember(int memberId, String name) {
        super(memberId, name);
    }

    public int getBorrowLimit() {
        return 5;
    }

    public int getFinePerDay() {
        return 5;
    }
}
