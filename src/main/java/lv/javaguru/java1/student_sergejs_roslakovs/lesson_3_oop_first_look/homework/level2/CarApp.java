package lv.javaguru.java1.student_sergejs_roslakovs.lesson_3_oop_first_look.homework.level2;

class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 25000);
        Car car2 = new Car("Honda", "Blue", 30000);
        Car car3 = new Car("Ford", "Black", 35000);

        System.out.println("Car 1: " + car1.getBrand() + " " + car1.getColor() + " " + car1.getPrice());
        System.out.println("Car 2: " + car2.getBrand() + " " + car2.getColor() + " " + car2.getPrice());
        System.out.println("Car 3: " + car3.getBrand() + " " + car3.getColor() + " " + car3.getPrice());
    }

}



