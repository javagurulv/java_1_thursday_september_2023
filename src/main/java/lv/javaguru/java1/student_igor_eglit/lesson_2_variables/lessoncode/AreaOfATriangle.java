package lv.javaguru.java1.student_igor_eglit.lesson_2_variables.lessoncode;

//Так как класс Scanner находится в пакете java.util,
// то мы вначале его импортируем с помощью инструкции
// import java.util.Scanner.
import java.util.Scanner;
public class AreaOfATriangle {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите значения для трех сторон треугольника");
        System.out.print("Triangle side A: ");
        double TriangleSideA = in.nextInt();
        System.out.print("Triangle side B: ");
        double TriangleSideB = in.nextInt();
        System.out.print("Triangle side C: ");
        double TriangleSideC = in.nextInt();

        double P = (TriangleSideA + TriangleSideB + TriangleSideC) / 2;
        double Area = Math.sqrt(P*(P-TriangleSideA)*(P-TriangleSideB)*(P-TriangleSideC));
        System.out.println("Площадь треугольника составит \n" + Area);

        //\n  перевод каретки на следующую строку
    }
}
