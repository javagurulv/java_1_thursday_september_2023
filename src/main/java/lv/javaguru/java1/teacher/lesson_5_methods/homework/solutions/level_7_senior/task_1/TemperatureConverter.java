package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_7_senior.task_1;

class TemperatureConverter {

    public double convertFromCelsiusToFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }

    public double convertFromFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

}
