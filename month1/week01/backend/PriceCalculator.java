
public class PriceCalculator {
    public static void main(String[] args) {
   
      String productName = "Laptop";
        double originalPrice = 2500000;
        double discountPercent = 15;  // 15%
        double taxPercent = 10;       // 10% НӨАТ

        // Тооцоолол
        double discountAmount = originalPrice * discountPercent / 100;
        double priceAfterDiscount = originalPrice - discountAmount;
        double taxAmount = priceAfterDiscount * taxPercent / 100;
        double finalPrice = priceAfterDiscount + taxAmount;

        // Хэвлэх
        System.out.println("Бараа: " + productName);
        System.out.println("Анхны үнэ: " + originalPrice + "₮");
        System.out.println("Хөнгөлөлт: " + discountPercent + "%");
        System.out.println("НӨАТ: " + taxPercent + "%");
        System.out.println("─────────────────────────");
        System.out.println("Хөнгөлөлтийн дүн: " + discountAmount + "₮");
        System.out.println("Хөнгөлсний дараа: " + priceAfterDiscount + "₮");
        System.out.println("НӨАТ дүн: " + taxAmount + "₮");
        System.out.println("Нийт төлөх: " + finalPrice + "₮");
    }
}
