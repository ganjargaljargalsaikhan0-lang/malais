public class Ex03 {
    public static void main(String[] args) {
        int score = 75;
boolean hasBonus = true;

// Тэнцсэн бол: оноо >= 60 БА bonus-тай
if (score >= 60 && hasBonus) {
    System.out.println("Тэнцсэн!");
}

// Амралтын өдөр: Saturday (6) ЭСВЭЛ Sunday (7)
int day = 6;
if (day == 6 || day == 7) {
    System.out.println("Амралтын өдөр");
}

// Нэвтрээгүй бол
boolean loggedIn = false;
if (!loggedIn) {
    System.out.println("Нэвтэрнэ үү");
}

    }
}
