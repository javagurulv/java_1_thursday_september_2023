package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_7_senior;

import static java.lang.Math.pow;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
public void calculateArea(){
        var result = Math.PI * pow(radius,2);
    System.out.println("Площадь круга равна "+ result);
}

}
