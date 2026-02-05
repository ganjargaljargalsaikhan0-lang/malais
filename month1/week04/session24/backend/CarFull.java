package week04.session24.backend;

class Car {
    private String brand;
    private String model;
    private int year;
    private int currentSpeed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;

    }

    public int getYear() {
        return year;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;

    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    void accelerate(int amount) {
        currentSpeed += amount;
        if (currentSpeed > 200) {
            currentSpeed = 200;

        }
    }
    void brake(int amount){
        currentSpeed -= amount;
        if (currentSpeed < 0) {
            currentSpeed = 0;
            
        }

    }
    int getAge() {
        return 2025 - year;
    }
    public boolean isMoving() {
        return currentSpeed > 0;
    }
    void displayInfo() {
        System.out.println("=====mashinii medeelel======");
        System.out.println("brand: " + brand );
        System.out.println("zagvar: " + model);
        System.out.println("uildverlsn on: " + year);
        System.out.println("mashinii nas: " + getAge());
        System.out.println("hudulj bainuu: " + isMoving());
        System.out.println("odoogiin hurd: " + currentSpeed + "км/ц");
        System.out.println();

    }
}
public class CarFull {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("toyota");
        car.setModel("camry");
        car.setYear(2020);
        car.setCurrentSpeed(0);


        car.displayInfo();

        System.out.println("50 км/ц хурдасгав...");
        car.accelerate(50);
        System.out.println("Одоогийн хурд: " + car.getCurrentSpeed() + " км/ц");
        System.out.println("Хөдөлж байна: " + car.isMoving());
        System.out.println();
       

        car.brake(20);
        System.out.println("Одоогийн хурд: " + car.getCurrentSpeed() + " км/ц");
        car.displayInfo();

        if (car.isMoving()) {
            System.out.println("mashin hudulj baina");
        } else {
            System.out.println("hudulku baina");
        }
    }
}