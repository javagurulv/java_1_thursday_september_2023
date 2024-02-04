package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson3.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "BLACK", 50000);
        Car car2 = new Car("AUDI", "RED", 45000);
        Car car3 = new Car("MERCEDES", "WHITE", 40000);

        System.out.println("Model = " + car1.getModel());
        System.out.println("Model = " + car2.getModel());
        System.out.println("Model = " + car3.getModel());

        System.out.println("Color = " + car1.getColor());
        System.out.println("Color = " + car2.getColor());
        System.out.println("Color = " + car3.getColor());

        System.out.println("Color = " + car1.getPrice());
        System.out.println("Color = " + car2.getPrice());
        System.out.println("Color = " + car3.getPrice());

    }
    }

