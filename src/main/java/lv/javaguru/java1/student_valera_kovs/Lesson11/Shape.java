package lv.javaguru.java1.student_valera_kovs.Lesson11;

abstract class Shape {

    abstract double calculateArea();

    abstract double calculatePerimeter();
    public String shapeName;

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }



}
