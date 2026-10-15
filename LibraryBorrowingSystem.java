
class Book {
    private int bookId;
    private String title;
    private boolean available;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        available = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + title);
        System.out.println("Available: " + available);
    }
}

class Member {
    private int memberId;
    private String name;
    protected int borrowedCount = 0;
    protected Book[] borrowedBooks = new Book[5];

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int getBorrowLimit() {
        return 1;
    }

    public void displayMember() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + name);
    }

    public void borrowBook(Book book) {
        if (book.isAvailable() == false) {
            System.out.println("Sorry! Book is not available.");
        } else if (borrowedCount >= getBorrowLimit()) {
            System.out.println("Borrowing limit reached!");
        } else {
            borrowedBooks[borrowedCount] = book;
            borrowedCount++;
            book.setAvailable(false);

            System.out.println(name + " borrowed: "
                    + book.getTitle());
        }
    }

    public void returnBook(Book book) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i] == book) {
                borrowedBooks[i] = borrowedBooks[borrowedCount - 1];
                borrowedBooks[borrowedCount - 1] = null;
                borrowedCount--;

                book.setAvailable(true);

                System.out.println(name + " returned: "
                        + book.getTitle());
                return;
            }
        }

        System.out.println("This member has not borrowed this book.");
    }
}

class StudentMember extends Member {
    public StudentMember(int id, String name) {
        super(id, name);
    }

    @Override
    public int getBorrowLimit() {
        return 2;
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Student borrowing request:");
        super.borrowBook(book);
    }
}

class TeacherMember extends Member {
    public TeacherMember(int id, String name) {
        super(id, name);
    }

    @Override
    public int getBorrowLimit() {
        return 5;
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Teacher borrowing request:");
        super.borrowBook(book);
    }
}

public class LibraryBorrowingSystem {
    public static void main(String[] args) {

        // Books array
        Book[] books = new Book[3];

        books[0] = new Book(101, "Java Programming");
        books[1] = new Book(102, "OOP Concepts");
        books[2] = new Book(103, "Data Structures");

        // Members array
        Member[] members = new Member[2];

        members[0] = new StudentMember(1, "Bilal Waleed");
        members[1] = new TeacherMember(2, "Ahmed Ali");

        // Display members
        System.out.println("===== MEMBER INFORMATION =====");

        for (int i = 0; i < members.length; i++) {
            members[i].displayMember();
            System.out.println();
        }

        // Display books
        System.out.println("===== BOOK INFORMATION =====");

        for (int i = 0; i < books.length; i++) {
            books[i].displayBook();
            System.out.println();
        }

        // Student borrowing
        System.out.println("===== BORROWING RESULTS =====");

        members[0].borrowBook(books[0]);
        members[0].borrowBook(books[1]);

        // Student reaches limit
        members[0].borrowBook(books[2]);

        // Teacher borrowing
        members[1].borrowBook(books[2]);

        // Returning a book
        System.out.println("\n===== RETURNING RESULTS =====");

        members[0].returnBook(books[0]);

        // Borrowing after returning
        System.out.println("\n===== BORROW AGAIN =====");

        members[0].borrowBook(books[2]);

        // Display updated book status
        System.out.println("\n===== UPDATED BOOK INFORMATION =====");

        for (int i = 0; i < books.length; i++) {
            books[i].displayBook();
            System.out.println();
        }
    }
}
