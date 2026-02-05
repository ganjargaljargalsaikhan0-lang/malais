package week04.session24.backend;

public class Book {

    private String title;
    private String author;
    private int pages;
    private double price;

    public String getTitle() {
        return title;
    }
    public String getAuthor(){
        return author;

    }
    public int getPages(){
        return pages;
    }
    public double getPrice(){
        return price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPages(int pages){
        this.pages = pages;

    }
    public void setPrice(double price) {
        this.price = price;
    }
        public int getReadingTime() {
        return pages / 30;
    }
    void applyDiscount(double percent) {
        double discount = price * percent / 10;
        price -=discount;
        System.out.println(title + " " + author + " " + percent + "hunglult");
        System.out.println("new price" + price + "₮");
    }

    void displayInfo(){
        System.out.println(title + " " + author + " " + pages + " " + price + "₮");
    }
}
public class BookFull {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("dadal");
        book.setAuthor("medku");
        book.setPages(300);
        book.setPrice(30);

        book.displayInfo();



        System.out.println("unshih hugtsaa" + book.getReadingTime() + "2tsag");

        book.applyDiscount(10);
        System.out.println("hunglult" + book.getPrice()+ "$");
    }
        
}