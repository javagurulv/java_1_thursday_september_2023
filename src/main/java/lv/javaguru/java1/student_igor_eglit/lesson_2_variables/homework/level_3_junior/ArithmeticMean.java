package lv.javaguru.java1.student_igor_eglit.lesson_2_variables.homework.level_3_junior;

//Так как класс Scanner находится в пакете java.util,
// то мы вначале его импортируем с помощью инструкции
// import java.util.Scanner.
import java.util.Scanner;

public class ArithmeticMean {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Input 3 integers to calculate the arithmetic mean ");
        System.out.println();
        System.out.print("First integer: ");
        int integer1 = in.nextInt();
        System.out.print("Second integer: ");
        int integer2 = in.nextInt();
        System.out.print("Third integer: ");
        int integer3 = in.nextInt();

        double Mean = (float) (integer1 + integer2 + integer3) / 3;

        System.out.println();
        System.out.print("the arithmetic mean = " + Mean);

        //\n  перевод каретки на следующую строку
    }
}
