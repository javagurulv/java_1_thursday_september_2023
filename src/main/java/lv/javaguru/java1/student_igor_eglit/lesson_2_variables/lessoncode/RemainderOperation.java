package lv.javaguru.java1.student_igor_eglit.lesson_2_variables.lessoncode;
import java.util.Scanner;
public class RemainderOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();

        int b = number% 2; //операция остатка от деления
        if (b == 0) { //== true, если операнд слева равен операнду справа
            System.out.println(number + " четное число");}
            else if (b==1) {//!= true, если операнд слева не равен операнду справа
            System.out.println(number + " нечетное число");
                            }
    }
}
