public class Ex02 {
    public static void main(String[] args) {
        int age = 25;
        String category;

if (age < 13) {
    category = "Хүүхэд";
} else if (age < 20) {
    category = "Өсвөр нас";
} else if (age < 60) {
    category = "Насанд хүрэгч";
} else {
    category = "Ахмад";
}

System.out.println(category);

    }
}
