package Conversor;

public abstract class Temperatura extends Conversor {
    public static final String CELSIUS = "Celsius";
    public static final String KELVIN = "Kelvin";
    public static final String FAHRENHEIT = "Fahrenheit";

    public abstract double celsiusToKelvin(double celsius);
    public abstract double kelvinToCelsius(double kelvin);
    public abstract double celsiusToFahrenheit(double celsius);
    public abstract double fahrenheitToCelsius(double fahrenheit);
    public abstract double kelvinToFahrenheit(double kelvin);
    public abstract double fahrenheitToKelvin(double fahrenheit);
}
