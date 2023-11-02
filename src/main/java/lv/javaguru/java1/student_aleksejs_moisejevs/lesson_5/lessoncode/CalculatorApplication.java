package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_5.lessoncode;

class CalculatorApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //boolean result = calculator.isEven(4);
        System.out.println("4 = " + calculator.isEven(4));
        System.out.println("5 = " + calculator.isEven(5));
        System.out.println("6 = " + calculator.isEven(6));
        System.out.println("7 = " + calculator.isEven(7));

        System.out.println("8 = " + calculator.isEdi(8));
        System.out.println("9 = " + calculator.isEdi(9));
        System.out.println("10 = " + calculator.isEdi(10));
        System.out.println("11 = " + calculator.isEdi(11));

        System.out.println("8-8 = " + calculator.findAverageDouble(8, 8));
        System.out.println("9-10 = " + calculator.findAverageDouble(9, 10));
        System.out.println("10-12 = " + calculator.findAverageDouble(10, 12));
        System.out.println("11-15 = " + calculator.findAverageDouble(11, 15));

    }

}


