public class ArreyList {

    public static void main(String[] args) {

        ArreyList<String> names = new ArreyList<>();
        names.add("clove");
        names.add("jett");
        names.add("sage");
        names.add("yoru");
        names.add("tejo");

        System.out.println("agent :");
        for (String name : names) {
            System.out.println(name);
        }
        ArreyList<Integer> numbers = new ArreyList<>();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
            sum += i;
        }
        numbers.set(2, 100);
        numbers.remove(2);

    }
}