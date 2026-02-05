public class Loops {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 100) {
            System.out.println(count);
            count = count + 1;
        }
        int sum =0;
        count = 1;
        while (count<=100) {
            sum = sum + count;
            count = count +1;
        }
        System.out.println(sum);

        for(int i = 1; i <=10; i=i + 1){
            System.out.println(i);

        }
        sum = 0;
        for(int i = 1; i <=100; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
