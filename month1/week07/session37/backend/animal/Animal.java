


public abstract class Animal {

    protected String name ;

    public Animal(String name){
         this.name = name ;
    
    }
   public abstract void makeSound();
   public abstract void move();

   public void intrduce(){
    System.out.println("I am " + name + ", I am a " + getClass().getSimpleName());
   }
}
