import Conversor.Money;

import javax.swing.*;
import java.text.DecimalFormat;

public class Utils {
    Money[] coins = new Money[]{ new Money(1 , "Peso Argentino"),
            new Money(385.24, "Dólar"),
            new Money(412.86 , "Euros"),
            new Money(464.00, "Libras Esterlinas"),
            new Money(0.30, "Won sul-coreano") ,
            new Money(2.88, "Yen Japonés")
    };
    DecimalFormat df = new DecimalFormat("#.##");

    public void showView(double input, int numberCoin1, int  numberCoin2){
        double valorRef = valueRef(input,numberCoin1,numberCoin2);
        JOptionPane.showMessageDialog(null, "Equivalen a : "+ df.format(valorRef) +" "+ coins[numberCoin2].getMoneyName());
    }

    public double valueRef(double input,int numberCoin1, int numberCoin2){
        return coins[numberCoin1].converser(input, coins[numberCoin2]);
    }

    public void desitionC(double input ,String[] option,String comparator){
        assert comparator != null;
        if (comparator.equals(option[0])) {
            showView(input,0,1);
        } else if (comparator.equals(option[1])) {
            showView(input,0,2);
        } else if (comparator.equals(option[2])) {
            showView(input, 0, 3);
        } else if (comparator.equals(option[3])) {
            showView(input, 0, 4);
        } else if (comparator.equals(option[4])) {
            showView(input, 0, 5);
        } else if (comparator.equals(option[5])) {
            showView(input, 1, 0);
        } else if (comparator.equals(option[6])) {
            showView(input, 2, 0);
        } else if (comparator.equals(option[7])) {
            showView(input, 3, 0);
        } else if (comparator.equals(option[8])) {
            showView(input, 4, 0);
        } else if (comparator.equals(option[9])) {
            showView(input, 5, 0);
        }
    }
    public void programEndless(){
        JOptionPane.showMessageDialog(
                null,
                "El programa está terminado",
                "Terminado",
                JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0);
    }

    public double readNumber(String message) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(message);
                double number = Double.parseDouble(input);
                return number;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No ingresó un número válido. Inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void designationT(double input, String[] optionsSelect, String selectedItem) {
        String[] items = selectedItem.split(" a ");
        String fromTemp = items[0];
        String toTemp = items[1];
        double result = 0;
        if(fromTemp.equals("Celsius") && toTemp.equals("Fahrenheit")) {
            result = celsiusToFahrenheit(input);
        } else if(fromTemp.equals("Fahrenheit") && toTemp.equals("Celsius")) {
            result = fahrenheitToCelsius(input);
        } else if(fromTemp.equals("Celsius") && toTemp.equals("Kelvin")) {
            result = celsiusToKelvin(input);
        } else if(fromTemp.equals("Kelvin") && toTemp.equals("Celsius")) {
            result = kelvinToCelsius(input);
        }
        JOptionPane.showMessageDialog(null, input + " " + fromTemp + " son " + result + " " + toTemp);
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }


}
