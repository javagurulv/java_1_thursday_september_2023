package lv.javaguru.java1.student_igor_eglit.lesson_2_variables.homework.level_1_intern;
import java.util.Scanner;
import java.lang.Math;
import static java.lang.Math.pow;

//импорт объектов класса Math
//Библиотека классов java.lang.Math содержит константы и методы,
// нужные для выполнения математических вычислений
public class PerimeterAreaOfCircle {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Radius = ");
        //Программа работает пока только с целыми числами
        float radius = in.nextFloat();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * pow(radius,2);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
