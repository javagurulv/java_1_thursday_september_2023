package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_7_senior.task_1;

class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
