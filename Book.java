public class Book {
    private String title;
    private String author;
    private int price;
    public void display(String title,String author,int price){
        System.out.println("titlev "+title);
        System.out.println("author "+author);
        System.out.println("price "+price);
    }
    public static void main(String[] args) {
        Book b=new Book();
        b.display("Harray Potter","Gaurav Guzzar",1000000);
    }
}
