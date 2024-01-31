public class ConversorTemperatura {

    // Método para converter de Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método para converter de Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        // Testando o método celsiusParaFahrenheit
        double celsius = 25;
        double fahrenheit = celsiusParaFahrenheit(celsius);
        System.out.println(celsius + " °C equivale a " + fahrenheit + " °F");

        // Testando o método fahrenheitParaCelsius
        fahrenheit = 77;
        celsius = fahrenheitParaCelsius(fahrenheit);
        System.out.println(fahrenheit + " °F equivale a " + celsius + " °C");
    }
}

