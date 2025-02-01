class LibraryBook {
    String title, author;
    double price;
    boolean isAvailable;

   
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            System.out.println(title + " has been borrowed.");
            isAvailable = false;
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java Programming", "James Gosling", 29.99);
        book.displayDetails();
        book.borrowBook();
        book.borrowBook(); 
    }
}
