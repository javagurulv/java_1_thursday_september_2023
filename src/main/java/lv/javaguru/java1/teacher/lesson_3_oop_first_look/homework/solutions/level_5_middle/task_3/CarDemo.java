package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_5_middle.task_3;

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
