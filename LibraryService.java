import java.util.*;
public class LibraryService {
    List<Book> books = new ArrayList<>();
    List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public Book getBook(int bookId) {
        for (Book b : books)
            if (b.getId() == bookId)
                return b;
        return null;
    }

    public Member getMember(int memberId) {
        for (Member m : members)
            if (m.memberId == memberId)
                return m;
        return null;
    }

    public void listBooks() {
        for (Book b : books) {
            System.out.println(b.getId() + " | " + b.getTitle() +
                    " | Available: " + b.getAvailableCopies());
        }
    }
}
