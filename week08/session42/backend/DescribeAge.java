public class DescribeAge {
    public static String describeAge(int age) {
        if (age < 13)
            return "child";
        if (age < 18)
            return "teenager";
        if (age < 65)
            return "adult";
        return "senior";
    }

    public static void main(String[] args) {
        System.out.println(describeAge(5));
        System.out.println(describeAge(15));
        System.out.println(describeAge(30));
        System.out.println(describeAge(70));
    }
}