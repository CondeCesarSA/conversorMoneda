import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        // Iniciacion de instancia.
        Utils utils = new Utils();
        // opciones disponibles
        String[] optionMoneyOrT = {"Conversor de moneda", "Conversor de Temperatura"};
        // mensaje del cuadro de diálogo
        String message = "Selecione una opción de conversión:";
        int opcionSN;

        // muestra el cuadro de diálogo y recupera la opción seleccionada
        int selectedOption = JOptionPane.showOptionDialog(
                null,
                message,
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                optionMoneyOrT,
                optionMoneyOrT[0]);

        // muestra un mensaje de acuerdo a la opción seleccionada
        if (selectedOption == 0) {
            /// Visual conversor
            //Opciones
            String[] optionCurrency = {"Peso Argentino a Dólar", "Pesos Argentino a Euros", "Peso Argentino a Libra Estarlinas", "Peso Argentino a Won sul-coreano", "Peso Argentino a Yen Japonés ",
                    "Dólar a Peso Argentino", "Euros a Peso Argentino", "Libra Esterlinas a Peso Argentino", "Won sul-coreano  a Peso Argentino", "Yen Japonés a Peso Argentino"};
            // Menu desplegable de opciones
            JComboBox<String> comboBox = new JComboBox<>(optionCurrency);
            // Lo muestro

            do{
                JOptionPane.showOptionDialog(null,
                        comboBox,
                        "Selecciona una opción",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        null);
                String optionsSelect = (String) comboBox.getSelectedItem();

                double input = utils.readNumber("Ingresa la cantidad de "+ optionsSelect + " que deseas convertir.");

                assert optionsSelect != null;
                utils.desitionC(input,optionCurrency,optionsSelect);
                opcionSN = JOptionPane.showOptionDialog(
                        null,
                        "¿Desea continuar?",
                        "Confirmación",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[]{"Si", "No", "Cancelar"},
                        "Si"
                );
            }while (opcionSN == 0);
            // va bloque de codigo de Desea continuar.
            utils.programEndless();


        } else if (selectedOption == 1) {
            String[] optionTemperature = {"Celsius a Fahrenheit", "Fahrenheit a Celsius", "Celsius a Kelvin", "Kelvin a Celsius"};
            JComboBox<String> comboBoxTemperature = new JComboBox<>(optionTemperature);
            do{
                JOptionPane.showOptionDialog(null,
                        comboBoxTemperature,
                        "Selecciona una opción",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        null);
                String optionsSelect = (String) comboBoxTemperature.getSelectedItem();

                double input = utils.readNumber("Ingresa la cantidad de "+ optionsSelect + " que deseas convertir.");

                assert optionsSelect != null;
                utils.designationT(input,optionTemperature,optionsSelect);
                opcionSN = JOptionPane.showOptionDialog(
                        null,
                        "¿Desea continuar?",
                        "Confirmación",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[]{"Si", "No", "Cancelar"},
                        "Si"
                );
            }while (opcionSN == 0);
            // va bloque de codigo de Desea continuar.
            utils.programEndless();
        }

    }

}



