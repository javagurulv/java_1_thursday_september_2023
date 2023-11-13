package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_5.homework;

public class SpectrumColorDetector {
    public static void main(String[] args) {
        System.out.println(detectColor(420)); // Фиолетовый
        System.out.println(detectColor(490)); // Синий
        System.out.println(detectColor(550)); // Зеленый
        System.out.println(detectColor(585)); // Желтый
        System.out.println(detectColor(610)); // Оранжевый
        System.out.println(detectColor(700)); // Красный
        System.out.println(detectColor(300)); // Невидимый спектр
    }

    public static String detectColor(int wavelength) {
        if (wavelength >= 380 && wavelength <= 449) {
            return "Фиолетовый";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Синий";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return "Зеленый";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return "Желтый";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return "Оранжевый";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return "Красный";
        } else {
            return "Невидимый спектр";
        }
    }
}
