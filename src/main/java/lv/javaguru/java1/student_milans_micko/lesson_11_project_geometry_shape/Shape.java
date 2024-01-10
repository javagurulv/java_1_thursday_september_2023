package lv.javaguru.java1.student_milans_micko.lesson_11_project_geometry_shape;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}
