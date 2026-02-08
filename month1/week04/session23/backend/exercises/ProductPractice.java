package week04.session23.backend.exercises;

class Product {

    String name;
    double price;
    int quantity;

    void displayInfo() {
        System.out.println(name + "-" + price + "$" + "x" + quantity + "=" + calculateTotal() + "$");
    }

    double calculateTotal() {
        return price * quantity;
    }

}

public class ProductPractice {
    public static void main(String[] args) {
        Product[] products = new Product[3];
         Product laptop = new Product();
        laptop.name = "laptop";
        laptop.quantity = 1;
        laptop.price = 2_500_000;
        
        products[0] = laptop;

        Product mouse = new Product();
        mouse.name = "mouse";
        mouse.quantity = 3;
        mouse.price = 45_000;

        products[1] = mouse;

        Product keyboard = new Product();
        keyboard.name = "keyboard";
        keyboard.quantity = 2;
        keyboard.price = 85_000;

        products[2] = keyboard;
        

        double grandTotal = 0;

        for(int i = 0; i < products.length; i++){
            System.out.println("Product - " + (i+1));
            products[i].displayInfo();
            grandTotal = grandTotal + products[i].calculateTotal();

    
        }
        System.out.println("Grand Total" + grandTotal);
    }
}