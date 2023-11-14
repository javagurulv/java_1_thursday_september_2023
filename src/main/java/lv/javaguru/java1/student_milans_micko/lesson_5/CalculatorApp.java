package lv.javaguru.java1.student_milans_micko.lesson_5;

class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //boolean result = calculator.isEven(4);
        System.out.println("4 = " + calculator.isEven(4));
        System.out.println("5 = " + calculator.isEven(5));
        System.out.println("6 = " + calculator.isEven(6));
        System.out.println("7 = " + calculator.isEven(7));

        System.out.println("4 = " + calculator.isOdd(4));
        System.out.println("5 = " + calculator.isOdd(5));
        System.out.println("6 = " + calculator.isOdd(6));
        System.out.println("7 = " + calculator.isOdd(7));

        System.out.println("4-4 = " + calculator.findAverage(4, 4));
        System.out.println("4-5 = " + calculator.findAverage(4, 5));
        System.out.println("4-6 = " + calculator.findAverage(4, 6));
        System.out.println("4-8 = " + calculator.findAverage(4, 8));

        System.out.println(" " + calculator.discriminant(4, -5, 2));
        System.out.println(" " + calculator.isSquareRoot(4, -5, 2));
        System.out.println(" " + calculator.firstRoot(4, -5, 2));
        System.out.println(" " + calculator.secondRoot(4, -5, 2));
    }

}
