package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_7_senior;

public class TemperatureConverterApp {
    public static void main(String[] args) {
        TemperatureCFConverter converter=new TemperatureCFConverter();
        var resultF = converter.converterToF(32);
        var resultC = converter.converterToC(121);
        System.out.println("If C = 32 F = "+ resultF);
        System.out.println("If F = 121 C = " + resultC);
    }
}
