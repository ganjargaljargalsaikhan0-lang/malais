public class Ex03 {
    public static void main(String[] args) {
        // 1-10 хэвлэх, гэхдээ 7 дээр зогсоох
for (int i = 1; i <= 10; i++) {
    if (i == 7) {
        break;  // Loop-оос гарах
    }
    System.out.println(i);
}
// Гаралт: 1, 2, 3, 4, 5, 6

// 1-10 хэвлэх, гэхдээ тэгш тоонуудыг алгасах
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue;  // Алгасах
    }
    System.out.println(i);
}
// Гаралт: 1, 3, 5, 7, 9
    }
}
