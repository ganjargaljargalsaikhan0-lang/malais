

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public void printInfo() {
        System.out.printf("color: %s, area: %.2f%n", color, area());
    }

}