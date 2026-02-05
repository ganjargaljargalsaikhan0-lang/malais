
public class StudentInfo {
    public static void main(String[] args) {
        String lastName = "batbold";
        String firstName = "bold";
        int age = 20;
        String studentId = "CS2025001";
        double gpa = 3.75;
        boolean isActive = true;
        char gender = 'E';  // 'Э' эсвэл 'Ү'

        // Хэвлэх
        System.out.println("┌─────────────────────────────────────────────────────────────┐");
        System.out.println("│                    ОЮУТНЫ МЭДЭЭЛЭЛ                           │");
        System.out.println("├─────────────────────────────────────────────────────────────┤");
        System.out.println("│  Овог:         " + lastName );
        System.out.println("│  Нэр:          " + firstName );
        System.out.println("│  Нас:          " + age );
        System.out.println("│  Оюутны код:   " + studentId );
        System.out.println("│  GPA:          " + gpa );

        // Идэвхтэй эсэхийг "Тийм" / "Үгүй" гэж хэвлэх
        String activeText = isActive ? "Тийм" : "Үгүй";
        System.out.println("│  Идэвхтэй:     " + activeText );

         System.out.println("│  Хүйс:         " + gender );
        System.out.println("└─────────────────────────────────────────────────────────────┘");
    }
}
