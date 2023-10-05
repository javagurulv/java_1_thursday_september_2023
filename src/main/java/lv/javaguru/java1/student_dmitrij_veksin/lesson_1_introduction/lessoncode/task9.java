package lv.javaguru.java1.student_dmitrij_veksin.lesson_1_introduction.lessoncode;
import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
      Scanner number = new Scanner(System.in);
      //S=p(p-a)(p-b)(p-c)
        System.out.println("triangle1");
        double triangle1 = Scanner.nextDouble();

        System.out.println("triangle2");
        double triangle2 = Scanner.nextDouble();

        System.out.println("triangle3");
        double triangle3 = Scanner.nextDouble();

        double perimetr = 0.5 * (triangle1+triangle2+triangle3);
        double area = perimetr * (perimetr - triangle1)*(perimetr-triangle2)*(perimetr-triangle3);
        System.out.println("area" = area);
    }


}
