package lv.javaguru.java1.student_igor_eglit.lesson_2_variables.homework.level_3_junior;
import java.util.Scanner;
import java.lang.Math;
import static java.lang.Math.pow;


//импорт объектов класса Math
//Библиотека классов java.lang.Math содержит константы и методы,
// нужные для выполнения математических вычислений.
public class PerimeterAreaOfCircle {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Radius = ");

        //System.out.print выводит поле ввода в той же строке, System.out.println в следующей
        //почему на моем компьютере float number работают в Idea с запятой, а не с точкой?!!!!!
        double radius = in.nextDouble();
        System.out.println();//вывод расчетов через пустую строку в консоле

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * pow(radius,2);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
