package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level1;

import java.util.Scanner;

class WaveColor {

    public static String getColor(int wavelength) {
        if (violet(wavelength)) {
            return "Violet";
        }
        if (blue(wavelength)) {
            return "Blue";
        }
        if (green(wavelength)) {
            return "Green";
        }
        if (yellow(wavelength)) {
            return "Yellow";
        }
        if (orange(wavelength)) {
            return "Orange";
        }
        if (red(wavelength)) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
    static boolean violet(int wavelenght) {
        return wavelenght >= 380 && wavelenght < 449;
    }
    static boolean blue(int wavelenght) {
        return wavelenght >= 450 && wavelenght < 494;
    }
    static boolean green(int wavelenght) {
        return wavelenght >= 495 && wavelenght < 569;
    }
    static boolean yellow(int wavelenght) {
        return wavelenght >= 570 && wavelenght < 589;
    }
    static boolean orange(int wavelenght) {
        return wavelenght >= 590 && wavelenght < 619;
    }
    static boolean red(int waveenght) {
        return waveenght >= 620 && waveenght < 750;
    }

}

