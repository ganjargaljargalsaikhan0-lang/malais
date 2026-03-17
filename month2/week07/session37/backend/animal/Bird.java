

public class Bird extends Animal{
    
    public Bird (String name){
        super(name);
    }

    public void makeSound(){
        System.out.println("Tweet");
    }
    public void move() {
        System.out.println("fly");
    }
}
