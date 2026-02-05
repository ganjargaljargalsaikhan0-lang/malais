import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Эхлэх");
            System.out.println("2. Тохиргоо");
            System.out.println("3. Гарах");
            System.out.print("Сонголт: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Эхэллээ...");
            } else if (choice == 2) {
                System.out.println("Тохиргоо нээгдлээ...");
            } else if (choice == 3) {
                System.out.println("Баяртай!");
            } else {
                System.out.println("Буруу сонголт!");
            }

        } while (choice != 3);  // 3 сонгох хүртэл давтана

        scanner.close();
    }
}
