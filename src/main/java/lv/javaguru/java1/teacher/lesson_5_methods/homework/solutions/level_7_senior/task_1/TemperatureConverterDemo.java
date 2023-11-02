package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_7_senior.task_1;

class TemperatureConverterDemo {

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("Celsius 20, fahrenheit = "
            + converter.convertFromCelsiusToFahrenheit(20.0));
        System.out.println("Fahrenheit 68.0, celsius = "
                + converter.convertFromFahrenheitToCelsius(68.0));
    }

}
