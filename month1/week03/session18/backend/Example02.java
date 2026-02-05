public class Example02 {
    public static void main(String[] args) {
        System.out.println("Function with return type");
        int resultOne = returnOne();
        System.out.println(resultOne);
        System.out.println(returnPi());
        
        System.out.println(exponent0fNumber(3,4 ));

    }
    public static int returnOne(){
        return 1;
    }
    public static double returnPi(){
        return 3.14;
    }
    public static String returnHello(){
        return "Hello";
    }
    public static int addTwoNumbers(int a, int b){
        int result = a + b;
        return result;

    }
    public  static int subtractTwoNumbers(int a, int b){
        int result = a - b;
        return result;
    }
    public static int divideTwoNumbers(int a, int b){
        if (b == 0){
            return 0;
        } else {
            return a / b;
        }
    }
    public static int exponent0fNumber(int a, int b){
        int result = 1;
        for (int i = a; i < a; i++){
            result = result * b;
        }
        return result;
    }
}
