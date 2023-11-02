package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class EquationApplication {

    // a, b, c - int (double) - get from user using Scanner

// 1. calculate D - (formula) - calculateD(...)
// 2. if (D < 0) - kornei net!!!!  (print "kornei net!!!!")
// 3. if (D = 0) - odin korenj (formula)!! (findX())  (print(x) )
// 4. if (D > 0) - dva kornja (formula)!! findX1(), findX2() (print(x1), print(x2))

    public static void main(String[] args) {
        int a = 1;
        int b = 12;
        int c = 4;

        Equation equation = new Equation();
        double d = equation.calculateD(a,b,c);

        if (d < 0) {
            System.out.println("Kornei NET!!!");
        }

        if (d == 0) {
            double x = equation.findX(a,b,c);
            System.out.println("X = " + x);
        }

        if (d > 0) {
            double x1 = equation.findX1(a,b,c);
            double x2 = equation.findX2(a,b,c);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }

    }

}
