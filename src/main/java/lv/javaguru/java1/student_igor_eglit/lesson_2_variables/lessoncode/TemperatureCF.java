package lv.javaguru.java1.student_igor_eglit.lesson_2_variables.lessoncode;
import java.util.Scanner;
public class TemperatureCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите температуру цельсия: ");
        double tC = in.nextDouble();
        double tF = (tC*9)/5 + 32;
        double tK= tC + 273.15;

        System.out.println("tC="+tC+": tF="+tF+": tK="+tK);
    }
}
