package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_4;

public class CircleCalculationApp {
    public static void main(String[] args) {

        CircleCalculation circleCalculation = new CircleCalculation();

        System.out.println("Circle area is " + circleCalculation.calculateArea(2.0));
        System.out.println("Circle area is " + circleCalculation.calculateArea(3.0));
        System.out.println("Circle area is " + circleCalculation.calculateArea(4.0));

        System.out.println("Circle perimeter is " + circleCalculation.calculatePerimeter(2.0));
        System.out.println("Circle perimeter is " + circleCalculation.calculatePerimeter(3.0));
        System.out.println("Circle perimeter is " + circleCalculation.calculatePerimeter(4.0));
    }


    }
