package lv.javaguru.java1.student_kirils_petrovs.lesson_3_oop_first_look.level_7_senior.CircleRadius;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
