package lv.javaguru.java1.student_milans_micko.lesson_2_variables.homework.lesson3homework.lvl5;

public class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + myCar.getModel());
    }
}
