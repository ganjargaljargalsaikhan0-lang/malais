public class Example01 {
    public static void main(String[] args) {
        printHello();
        printHello();
        printHello();


        greet("ociroo 1");
        greet("ociroo 2");
        greet("ociroo 3");


        printline(5);
        printline(10);
    }
    public static void printHello(){
        System.out.println("Hello");
    }
    public static void greet(String name){
        System.out.println("Hello" + name +"!");

    }
    public static void printline(int count){
        for(int i=0; i < count; i++){
            System.out.print("_");
        }
        System.out.println();
    }
}
