

public abstract class Vehicle {
    protected String brand;
    protected String model;    

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public abstract String fuelType();
    public void describe(){
        System.out.println(brand + " " + model + " runs on " + fuelType());
    }
    
}
