package lv.javaguru.java1.student_daniels_demishins.lesson_5_methods.homework.lvl_4;

 class CircleApp {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius = 10. Perimetr = "+circle.circlePerimetr(10));
        System.out.println("Radius = 15. Perimetr = "+circle.circlePerimetr(15));
        System.out.println("Radius = 20. Perimetr = "+circle.circlePerimetr(20));

        System.out.println("Radius = 10. Square = "+circle.circleSquare(10));
        System.out.println("Radius = 15. Square = "+circle.circleSquare(15));
        System.out.println("Radius = 20. Square = "+circle.circleSquare(20));
    }
}
