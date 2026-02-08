package week04.session23.backend.exercises;

public class CirclePractice {
    class Circle {
        double raduis;
        String color;
        double PI = 3.14159;

        double calculateArea(){
            return raduis * raduis * PI;
        }
        double calculateCircumference(){
            return 2 * PI * raduis;
        }

        void displayInfo(){
            System.out.println("=== Circle 1 ===");
            System.out.println("ungu" + color);
            System.out.println("raduis" + raduis);
            System.out.println("talbai" + calculateArea());
            System.out.println("toirog" + calculateCircumference());
        }
    }
}

