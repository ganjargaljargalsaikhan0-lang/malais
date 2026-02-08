public class Ex01 {
    public static void main(String[] args) {
         String[] fruits = {"apple", "orange", "guzeelgene" ,"plum", "rainins"};

        // 2. Эхний жимс хэвлэх
        System.out.println("Эхний жимс: " + fruits[0]);

        // 3. Сүүлийн жимс хэвлэх
        System.out.println("Сүүлийн жимс: " + fruits[fruits.length - 1]);

        // 4. Array-ийн урт хэвлэх
        System.out.println("Нийт жимс: " + fruits.length);

        // 5. Гурав дахь жимсийг "Тарвас"-аар солих
        fruits[2] = "Тарвас";
        System.out.println("Шинэ гурав дахь: " + fruits[2]);

        // 6. Бүх жимсийг for loop-оор хэвлэх
        System.out.println("\n=== Бүх жимс ===");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }

        // 7. Бүх жимсийг for-each loop-оор хэвлэх
        System.out.println("\n=== For-each ===");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

