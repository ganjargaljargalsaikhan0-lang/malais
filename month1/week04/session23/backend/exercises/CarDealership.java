package week04.session23.backend.exercises;


class Car {
    String brand;
    String model;
    int year;
    double price;
    boolean isSolid;


    public Car(String string, String string2, int i, int j) {

    }

    public void displayInfo() {
        System.out.println(brand + " " + model + " (" + year + ") - " + price + "₮");
    }

    void sell() {
        isSolid = true;
        System.out.println(brand + " " + model + "zaragdlaa!");
    }

    void applyDiscount(double percent) {
        double discount = price * percent / 10;
        price -= discount;
        System.out.println(brand + " " + model + " " + percent + "hungulult");
        System.out.println("new price:" + price + "$");
    }
}
public class CarDealership {

    public static void main(String[] args) {
        System.out.println("=== Машины зарна ===");

        // 3 машин үүсгэх
        Car car1 = new Car("Toyota", "Camry", 2023, 45000000);
        Car car2 = new Car("Honda", "Civic", 2022, 35000000);
        Car car3 = new Car("Hyundai", "Elantra", 2021, 30000000);

        // Мэдээлэл хэвлэх
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();

        System.out.println();

        // Хөнгөлөлт хийх
        car1.applyDiscount(10);

        System.out.println();

        // Машин зарах
        car1.sell();
    }
}