package Day3_task;

import java.util.Scanner;

//main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice = 0;

        while (choice != 7) {
            System.out.println("\n ----Library Menu----");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Show Books");
            System.out.println("4. Show Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String bookTitle = scanner.nextLine();
                    library.addBook(bookId, bookTitle);
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    System.out.print("Enter User Name: ");
                    String userName = scanner.next();
                    library.addUser(userId, userName);
                    break;

                case 3:
                    library.showBooks();
                    break;

                case 4:
                    library.showUsers();
                    break;

                case 5:
                    System.out.print("Enter Book ID to issue:");
                    library.issueBook(scanner.nextInt());
                    break;

                case 6:
                    System.out.print("Enter Book ID to return:");
                    library.returnBook(scanner.nextInt());
                    break;

                case 7:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}




