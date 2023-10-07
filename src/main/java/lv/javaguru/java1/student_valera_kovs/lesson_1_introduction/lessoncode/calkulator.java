package lv.javaguru.java1.student_valera_kovs.lesson_1_introduction.lessoncode;

import java.util.Scanner;
public class calkulator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //S=p(p-a)(p-b)(p-c)
            System.out.println("triangle1");
            double triangle1 = scanner.nextDouble();

            System.out.println("triangle2");
            double triangle2 = scanner.nextDouble();

            System.out.println("triangle3");
            double triangle3 = scanner.nextDouble();

            double perimetr = 0.5 * (triangle1+triangle2+triangle3);
            double area = perimetr * (perimetr - triangle1)*(perimetr-triangle2)*(perimetr-triangle3);
            System.out.println("area = " + area);
        }
}
