package Conversor;

public class Temperature extends Temperatura {

    public Temperature() {
        this.setName("Temperature");
    }

    @Override
    public double converser(double count, Conversor conversor) {
        if (conversor instanceof Temperature) {
            Temperature other = (Temperature) conversor;
            double kelvin = other.celsiusToKelvin(this.kelvinToCelsius(count));
            return other.kelvinToCelsius(kelvin);
        } else {
            throw new IllegalArgumentException("Conversor inválido para Temperatura.");
        }
    }

    @Override
    public double noConverser(double count, Conversor conversor) {
        if (conversor instanceof Temperature) {
            Temperature other = (Temperature) conversor;
            double kelvin = this.celsiusToKelvin(count);
            return other.kelvinToCelsius(other.fahrenheitToKelvin(kelvin));
        } else {
            throw new IllegalArgumentException("Conversor inválido para Temperatura.");
        }
    }

    @Override
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    @Override
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    @Override
    public double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    @Override
    public double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }
}

