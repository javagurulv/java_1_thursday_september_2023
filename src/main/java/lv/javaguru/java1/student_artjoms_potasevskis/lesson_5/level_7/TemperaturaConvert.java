package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_7;

class TemperaturaConvert {
    public double convertFromCelsiusToFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }

    public double convertFromFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

}
