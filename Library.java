package Day3_task;
import java.util.ArrayList;

public class Library {
    
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public void addBook(int id, String title) {
        books.add(new Book(id, title));
        System.out.println("Book added");
    }

    public void addUser(int userId, String name) {
        users.add(new User(userId, name));
        System.out.println("User registered");
    }

    public void showBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public void showUsers() {
        for (User u : users) {
            u.display();
        }
    }

    public void issueBook(int bookId) {
        for (Book b : books) {
            if (b.id == bookId && !b.isIssued) {
                b.isIssued = true;
                System.out.println("Book issued");
                return;
            }
        }
        System.out.println("Book not available");
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.id == bookId && b.isIssued) {
                b.isIssued = false;
                System.out.println("Book returned");
                return;
            }
        }
        System.out.println("Book not issued");
    }
}




