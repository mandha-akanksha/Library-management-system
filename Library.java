package Day3_task;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    User currentUser; // store currently logged in user

    // Login
    public void login(String name) {
        currentUser = new User(name);// create new user
        System.out.println("Welcome, " + currentUser.name );
    }

    // Add Book to library
    public void addBook(String title) {
        books.add(new Book(title)); 
    }

    // Show all Books
    public void showBooks() {
        System.out.println("\nBooks in Library:");
        for (Book book : books) {
            System.out.println("- " + book.title + " -> Issued: " + book.isIssued);
        }
    }

    // Issue a Book
    public void issueBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) // if book title matches
            {
                if (!book.isIssued)//if book not already issued
                 {
                    book.issue(); // issue the book
                    System.out.println("Book issued to " + currentUser.name);
                } else {
                    System.out.println("Book is already issued");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }

    // Return a Book
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) // if book title matches
            {
                if (book.isIssued)//if book is issued
                 {
                    book.returnBook();// return the book
                    System.out.println("Book returned by " + currentUser.name);
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }


}
