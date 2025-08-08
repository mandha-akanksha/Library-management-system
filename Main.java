package Day3_task;

import java.util.Scanner;

//main class
public class Main {
   
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // User login
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        library.login(userName);// calling login method

        // Adding books to the library
        library.addBook("Java");
        library.addBook("Web");
        library.addBook("SQL");

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.showBooks();// for displaying all books
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = scanner.nextLine();
                    library.issueBook(issueTitle); //for try to issue
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);// for try to return
                    break;
                case 4:
                    System.out.println("Thank you, " + userName);
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}


