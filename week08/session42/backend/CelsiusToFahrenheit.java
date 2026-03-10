public class CelsiusToFahrenheit {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(0));    
        System.out.println(celsiusToFahrenheit(100));  
    }

}
