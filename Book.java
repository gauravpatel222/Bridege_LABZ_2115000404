public class Book {
    private String title;
    private String author;
    private int price;
    public Book(){
        this.title="not";
        this.author="gt";
        this.price=1212;
    }
    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
    
    public static void main(String[] args) {
        Book b=new Book();
        Book b1=new Book("harry","Gaurav Guxzar",2312);
        b1.displayDetails();
        
    }
    public static char[] getAuthor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAuthor'");
    }
}
