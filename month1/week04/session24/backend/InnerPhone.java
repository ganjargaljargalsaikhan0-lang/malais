package week04.session24.backend;

class Phone {
    private String brand;
    private String model;
    private int storageGB;
    private int batteryPercent;

    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }

    int getStorageGB() {
        return storageGB;
    }

    int getBatteryPercent() {
        return batteryPercent;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    void setBatteryPercent(int batteryPercent) {
        this.batteryPercent = batteryPercent;
    }

    void charge(int percent) {
        batteryPercent += percent;
        if (batteryPercent > 100) {
            batteryPercent = 100;
        }
    }

    void usebattery(int percent) {
        batteryPercent -= percent;
        if (batteryPercent < 0) {
            batteryPercent = 0;
        }
    }

    boolean islowBattery() {
        return batteryPercent < 20;
    }

    void displayInfo() {
        System.out.println("=== Утасны мэдээлэл ===");
        System.out.println("brand: " + brand);
        System.out.println("Загвар: " + model);
        System.out.println(" Санах ой:" + storageGB + "Gb");
        System.out.println("battery: " + batteryPercent + "%");
        System.out.println();
        System.out.println("30% батерей зарцуулав...");
        System.out.println("Батерей: 70%");
        System.out.println("Батерей бага уу?: false");
        System.out.println();
        System.out.println("60% батерей зарцуулав...");
        System.out.println("Батерей: 10%");
        System.out.println("Батерей бага уу?: true");
    }
   
    // void displayBatteryStatus(){
    //     System.out.println("Батерей: " + batteryPercent + "%");
    //     System.out.println("Батерей бага уу?: " + islowBattery());
    
    }


public class InnerPhone {
    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.setBrand("samsung");
        phone.setModel("galaxy s24");
        phone.setStorageGB(256);
        phone.setBatteryPercent(100);

        // phone.displayInfo();

        phone.usebattery(50);

        phone.displayInfo();

       if (phone.islowBattery()) {
            System.out.println("battery is low");
       } else {
        System.out.println("battery normal");
       }
        
    }

}