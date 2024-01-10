package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.Lesson11Shape;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(String title, double a, double b) {
        super(title);
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculateArea() {
        return (a+b)*2;
    }
    @Override
    public double calculatePerimeter() {
        return a * b;

    }
}
