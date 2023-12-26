package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_7;


class TemperaturaConvertDemo{

    public static void main(String[] args) {
        TemperaturaConvert convert = new TemperaturaConvert();
        System.out.println("Celsius 25, fahrenheit = " + convert.convertFromCelsiusToFahrenheit(25.0));
        System.out.println("Fahrenheit 70.0, celsius = " + convert.convertFromCelsiusToFahrenheit(70));

    }
}