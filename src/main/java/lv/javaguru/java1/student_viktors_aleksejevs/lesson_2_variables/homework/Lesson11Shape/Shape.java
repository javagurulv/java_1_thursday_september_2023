package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.Lesson11Shape;

abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }
    abstract double calculateArea();

    abstract double calculatePerimeter();
}