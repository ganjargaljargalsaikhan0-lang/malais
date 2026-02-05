package week04.session23.backend;

public class Main {
    public static void main(String[] args) {
        
    
    Cat chloe = new Cat();
    System.out.println(chloe);
    chloe.catName = "chloe";
    System.out.println(chloe.catName);
    
    chloe.age = 4;
    System.out.println(chloe.age);

    chloe.gender = "Male";
    System.out.println(chloe.gender);

    chloe.weight = 35.5;
    System.out.println(chloe.weight);

    chloe.color = "balck";
    System.out.println(chloe.color);

    chloe.gettingOld();
    System.out.println(chloe.age);

    int chloeAge = chloe.getAge();
    System.out.println(chloeAge);
    for(int i = 0; i < 6; i++){
        System.out.println(chloe.getAge());
    }
    }
}

