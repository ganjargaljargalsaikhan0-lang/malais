
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();

    public void printInfo() {
        System.out.println(
            getClass().getSimpleName() +
            " color=" + color +
            " area=" + area() +
            " perimeter=" + perimeter()
        );
    }
}