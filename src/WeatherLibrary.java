/*
 * INSTRUCTIONS
 *
 * Implement the two temperature conversion methods in the weather library class below.
 *
 * 32°F -> 0°C
 * 212°F -> 100°C
 */

public class WeatherLibrary
{

    public static double fahrenheitToCelsius(double degrees)
    {
        // your code
        double celcius = (5.0/9.0)*(degrees - 32.0);
        return celcius;
    }

    public static double celsiusToFahrenheit(double degrees)
    {
        // your code
        double fahrenheit = (9.0/5.0)*degrees + 32.0;
        return fahrenheit;
    }
}
