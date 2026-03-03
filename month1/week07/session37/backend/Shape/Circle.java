class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double w, h;

    public Rectangle(String c, double w, double h) {
        super(c);
        this.w = w;
        this.h = h;
    }

    public double area() {
        return w * h;
    }

    public double perimeter() {
        return 2 * (w + h);
    }
}