package week04.session23.backend.exercises;

class Book {
    String title,author;
    int pages, price;
    boolean isAvaolable;

    void displayInfo() {

    }

    void borrow() {
        if (isAvaolable) {
            System.out.println(title + "nomiig zeellee");
            isAvaolable = false;
        }
    }
    void returnBook(){
        isAvaolable = true;
        if (isAvaolable) {
            System.out.println(title + "nomiig butsaalaa");
        }
    }
}


public class Booklibrary {
    public static void main(String[] args) {
        
    }
    
}