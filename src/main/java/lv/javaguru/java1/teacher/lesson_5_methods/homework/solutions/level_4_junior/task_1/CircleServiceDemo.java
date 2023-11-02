package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_4_junior.task_1;

class CircleServiceDemo {

    public static void main(String[] args) {
        CircleService circleService = new CircleService();
        System.out.println("Area (r = 2.0) = " + circleService.calculateArea(2.0));
        System.out.println("Area (r = 3.0) = " + circleService.calculateArea(3.0));
        System.out.println("Area (r = 4.0) = " + circleService.calculateArea(4.0));

        System.out.println("Perimeter (r = 2.0) = " + circleService.calculatePerimeter(2.0));
        System.out.println("Perimeter (r = 3.0) = " + circleService.calculatePerimeter(3.0));
        System.out.println("Perimeter (r = 4.0) = " + circleService.calculatePerimeter(4.0));
    }

}
