package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.Lesson11Shape;

public class Circle extends Shape {

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double calculatePerimeter(){
        return Math.PI * (radius * radius);
    }
}




