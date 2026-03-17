

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("woof");
    }

    @Override
    public void move() {
        System.out.println("running");
    }
    
}
