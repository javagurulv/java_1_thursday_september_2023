package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_5_middle;

class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String model = myCar.getModel();
        System.out.println("Car model = " + model);
    }
}
