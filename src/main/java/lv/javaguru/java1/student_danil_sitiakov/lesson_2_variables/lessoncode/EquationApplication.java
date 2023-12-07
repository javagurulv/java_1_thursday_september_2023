package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

public class EquationApplication {
    public static void main(String [] args) {
        int a = 10;
        int b =12;
        int c = 4;

        Equation equation= new Equation();
        double d = equation.calculate(a,b,c);

        if (d < 0) {
            System.out.println("kornei netu!!!");
        }
    }
}
