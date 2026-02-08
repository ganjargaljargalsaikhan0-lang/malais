public class Ex02 {
    public static void main(String[] args) {
        int age = 25;
        String category;

        if (age < 13) {
            category = "huuhed";
        } else if (age < 20) {
            category = "usvur nas";

        } else if (age < 60) {
            category = "nasand huregc";
        } else {
            category = "ahmad";
        }
        System.out.println(category);
    }
}
