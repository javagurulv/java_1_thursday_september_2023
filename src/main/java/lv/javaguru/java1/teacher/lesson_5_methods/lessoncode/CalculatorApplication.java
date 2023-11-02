package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class CalculatorApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //boolean result = calculator.isEven(4);
        System.out.println("4 = " + calculator.isEven(4));
        System.out.println("5 = " + calculator.isEven(5));
        System.out.println("6 = " + calculator.isEven(6));
        System.out.println("7 = " + calculator.isEven(7));

    }

}
