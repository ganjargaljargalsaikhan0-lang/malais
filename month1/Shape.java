
public abstract class Shape {
    protected String color;

    public Shape (String color){
        this.color = color;

    }
    public abstract double area();

    
    public abstract double perimetet();

    
    public void describe(){
        System.out.printf("%s [%s]area = %.2f%n", getClass().getSimpleName(),color,area());
    }
    public double perimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perimeter'");
    }
    
}
