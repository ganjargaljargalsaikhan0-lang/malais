import java.util.Scanner;  

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("too oruulna uu: ");

        int number = scanner.nextInt();            
        if (number % 2 == 0) {
            System.out.println(number + " tegsh too");
        } else {
            System.out.println(number + " sondgoi too");
        }

        scanner.close();  
    }
}
