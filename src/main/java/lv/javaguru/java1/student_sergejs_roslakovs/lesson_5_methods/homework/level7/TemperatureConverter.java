package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level7;

public class TemperatureConverter {

    private double dTempCelsius;
    private double dTempFahrenheit;

    public TemperatureConverter(double dTemp, boolean bCelsius) {
        if (bCelsius) {
            this.dTempCelsius = dTemp;
            this.dTempFahrenheit = celsiusToFahrenheit(dTemp);
        } else {
            this.dTempCelsius = FahrenheitToCelsius(dTemp);
            this.dTempFahrenheit = dTemp;
        }

    }

    public double celsiusToFahrenheit(double dCelsius) {
        return (dCelsius * 1.8) + 32;
    }

    public double FahrenheitToCelsius(double dFahrenheit) {
        return (dFahrenheit - 32) / 1.8;
    }

    public double getCelsius() {
        return this.dTempCelsius;
    }

    public double getFahrenheit() {
        return this.dTempFahrenheit;
    }

}
