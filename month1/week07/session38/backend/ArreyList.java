import java.util.ArrayList;

public class ArreyList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("clove");
        names.add("jett");
        names.add("sage");
        names.add("yoru");
        names.add("tejo");

        System.out.println("agent :");
        for (String name : names) {
            System.out.println(name);
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
            sum += i;
        }
        numbers.set(2, 100);
        numbers.remove(2);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");

        System.out.println("banana shalgah");
        if (fruits.contains("banana")) {
            System.out.println("banana baina");
        } else {
            System.out.println("banana bhgui baina");
        }
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("clove", 95));
        students.add(new Student("jett", 80));
        students.add(new Student("sage", 75));
        students.add(new Student("yoru", 85));
        students.add(new Student("tejo", 70));

        int sum1 = 0;
        for (Student s : students) {
            sum1 += s.score;
        }
        double average = (double) sum1 / students.size();
        System.out.println("average score :" + average);

        Student topStudent = students.get(0);
        for (Student s : students) {
            if (s.score > topStudent.score) {
                topStudent = s;
            }
        }
        System.out.println("hamgiin ih onoo :");
        System.out.println(topStudent.name + "--" + topStudent.score);

        System.out.println("\n 80 deesh onootoi agent:");
        for (Student s : students) {
            if (s.score > 80) {
                System.out.println(s.name + " - " + s.score);
            }
        }
    }
}

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
