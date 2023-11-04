package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_1_intern;

import java.util.Scanner;

public class WaveSpectrumApp {
    public static void main(String[] args) {

        WaveSpectrum waveSource = new WaveSpectrum();
        while (true) {
            System.out.print("Enter wave lenght: ");
            var waveLenght = new Scanner(System.in).nextInt();
            System.out.println("Spectrum: " + waveSource.result(waveLenght));
            if (waveLenght == 0) {
                break;
            }
        }
    }
}
