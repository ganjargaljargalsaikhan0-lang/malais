

public class Main {
    public static void main(String[] args) {
        Animal [] animals = {
            new  Dog("clove"),
            new Cat("clove"),
            new Bird("bird"),
            new Fish("nemo")
            

        };
        for (Animal a :  animals) {
            a.intrduce();
            a.makeSound();
            a.move();
            System.out.println();
        }
    }
}
