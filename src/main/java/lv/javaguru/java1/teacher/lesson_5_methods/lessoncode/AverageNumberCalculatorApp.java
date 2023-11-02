package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class AverageNumberCalculatorApp {

    public static void main(String[] args) {
        AverageNumberCalculator calculator = new AverageNumberCalculator();
        System.out.println("Average = " + calculator.findAverage(10, 20));
        System.out.println("Average = " + calculator.findAverage(15, 111));
        System.out.println("Average = " + calculator.findAverage(7, 8));
        System.out.println("Average = " + calculator.findAverageDouble(7, 8));
    }

}
