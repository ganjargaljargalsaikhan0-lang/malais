package mn.icode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class InputWriter {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        Scanner scanner = new Scanner(System.in);
        try {
            
            String userInput = scanner.nextLine();
            writer = new BufferedWriter(new FileWriter("user_input.txt", true));
            writer.write(userInput);
            writer.newLine();

         
        } catch (Exception e){
            System.out.println("Error occurred" + e.getMessage());
        }finally {
            scanner.close();
            if (writer != null) {
                try {
                    writer.close();
                } catch (Exception e ){
                    System.out.println("Error during file close" + e.getMessage());
                }
            }
        }
    }
}
