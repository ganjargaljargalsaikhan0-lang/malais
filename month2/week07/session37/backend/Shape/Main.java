

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
    new Circle("Red", 5),
    new Rectangle("Blue", 4, 6)
};

double totalArea = 0;

for (Shape s : shapes) {
    s.printInfo();
    totalArea += s.area();
}

System.out.println("Total area = " + totalArea);
    }
}
