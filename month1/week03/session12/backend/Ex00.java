import java.util.Scanner;

public class Ex00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Too oruulna uu:");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Tegsh too");
        } else {
            System.out.println("Sondgoi too");
        }

        sc.close();
    }
}
