import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        BorrowService borrowService = new BorrowService(library);

        // Sample data
        library.addBook(new Book(1, "Java", 3));
        library.addBook(new Book(2, "Python", 2));

        library.addMember(new StudentMember(1, "Alice"));
        library.addMember(new RegularMember(2, "Bob"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.List Books\n2.Borrow\n3.Return\n4.Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                library.listBooks();
            } else if (choice == 2) {
                System.out.print("Member ID: ");
                int mid = sc.nextInt();
                System.out.print("Book ID: ");
                int bid = sc.nextInt();
                borrowService.borrowBook(mid, bid);
            } else if (choice == 3) {
                System.out.print("Member ID: ");
                int mid = sc.nextInt();
                System.out.print("Book ID: ");
                int bid = sc.nextInt();
                borrowService.returnBook(mid, bid);
            } else {
                break;
            }
        }
        sc.close();
    }
}
