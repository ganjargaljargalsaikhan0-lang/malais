import java.util.Scanner;

public class GradeCalculator {
     
            
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Оноо Үнэлгээний Систем ===");
        System.out.print("Оноо оруулна уу (0-100): ");
        int score = scanner.nextInt();

        // Оноо зөв эсэхийг шалгах
        if (score < 0 || score > 100) {
            System.out.println("Алдаа: Оноо 0-100 хооронд байх ёстой!");
        } else {
            if (score >= 80 ) {
                System.out.println("unelgee A");
            } else if (score >= 70) {
                System.out.println("unelgee B");
            } else if (score >= 60) {
                System.out.println("unelgee C");
            } else {
                System.out.println("unelgee F");
            }
            
          
        }

        scanner.close();
    }
}
    

