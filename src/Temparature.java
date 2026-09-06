public class Temparature {


    public static void main(String[] args) {

        // Input
        double celsius = 36.50;
        // Process
        double kelvin = kelvin(celsius);
        double fahrenheit =fahrenhiet(celsius);

        System.out.println(kelvin);
        System.out.println(fahrenheit);
    }

    public static double kelvin(double celsius) {
        double value = celsius + 273.15;
        return value;

    }

    public static double fahrenhiet(double celsius) {
        double value = celsius * 1.80 + 32.00;
        return value;
    }
}
