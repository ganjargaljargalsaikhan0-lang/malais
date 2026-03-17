package week07.session36.backend.shapes;
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red" , 5);
        Shape rectangle = new Rectangle("blue", 4 , 6);

        circle.printInfo();
        rectangle.printInfo();
    }
}
