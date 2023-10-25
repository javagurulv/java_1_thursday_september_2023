package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.homework.level_7;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
