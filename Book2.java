class Book2 {
    public String ISBN;
    protected String title;
    private String author;

    public Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public static void main(String[] args) {
        Book2 book = new Book2("1234567890", "Book Title", "John");
       System.out.println(book.getAuthor());
       EBook eBook=new EBook("232", "harrry", "guzzar");
            eBook.displayInfo();
    }
}

class EBook extends Book2 {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayInfo() {
        System.out.println("EBook ISBN: " + ISBN);   // Public access
        System.out.println("EBook Title: " + title); // Protected access
        System.out.println("author  "+getAuthor());
    }
}
