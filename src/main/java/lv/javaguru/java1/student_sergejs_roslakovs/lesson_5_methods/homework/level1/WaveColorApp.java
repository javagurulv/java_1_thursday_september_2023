package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level1;

import java.util.Scanner;

public class WaveColorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        while (true) {
            System.out.println("Enter the wavelength: ");
            int wavelength = scanner.nextInt();
            String color = WaveColor.getColor(wavelength);
            System.out.println(" Color: " + color);
            if (wavelength < 100) {
                break;
            }
            }
            

            {
            }

        }
    }









