

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car ("toyota", "Camry"),
            new ElectricCar("Tesla", "Model 3 "),
            new Truck ("Volvo", "FH")
        };
        for (Vehicle v :vehicles){
            v.describe();
        }
    }
}
