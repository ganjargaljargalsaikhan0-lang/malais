package week05.session27.backend;

 class Rectangle {
    private double width;
    private double heigth;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;

    }

    public double getWidth() {
        return  width;
    }
    public double getHeigth() {
        return heigth;
    }

    public double calculateArea() {
        return width * heigth;
    }
    public double calculatePerimeter(){
        return 2 * (width + heigth);
    }
    public boolean isSquare() {
        return width == heigth;
    }
    void display(){
        System.out.println("=== Rectangle 1 === ");
        System.out.println("Хэмжээ: " + width + " x " + heigth);
        System.out.println("Талбай: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter() );
        System.out.println("Квадрат: " + isSquare() != null? "yes" : "no");
        System.out.println();
   
    }

}
public class RectangleFull {

    public static void main(String[] args) {
        Rectangle rc01 = new Rectangle(4, 7);
        Rectangle rc02 = new Rectangle(9, 3);

        rc01.display();
        rc02.display();
    }

}