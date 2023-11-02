package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class EquationApplication {

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
