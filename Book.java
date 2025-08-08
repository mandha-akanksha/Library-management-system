package Day3_task;

public class Book {
    
    String title;
    boolean isIssued; // whether the book is issued or not

    public Book(String title) {
        this.title = title;
        this.isIssued = false;// by default book is not issued
    }

    //mark the book as issued
    public void issue() {
        isIssued = true;
    }

    //mark the book as returned
    public void returnBook() {
        isIssued = false;
    }
}


