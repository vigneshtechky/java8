package vsu;

public class Temperature1 {
    public static void main(String[] args) {

        //input
        double celsius = 122.11;

        double kelvin = kelvin(celsius);
        double fahrenhiet = fahrenheit(celsius);
        System.out.println(kelvin);
        System.out.println(fahrenhiet);
    }

    public static double kelvin(double celsius) {
        double value = celsius + 273.15;
        return value;

    }

    public static double fahrenheit(double celsius) {
        double value = celsius * 1.80 + 32.00;
        return value;

    }
}



