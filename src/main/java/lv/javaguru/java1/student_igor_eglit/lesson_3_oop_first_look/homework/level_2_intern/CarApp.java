package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_2_intern;

public class CarApp {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "Red", 35000);
        Car ford = new Car("Ford", "Green", 30000);
        Car ram = new Car("Ram 1500", "Black", 45000);
        toyota.setModel("Mercedes");
        toyota.setColor("Blue");
        toyota.setPrice(55000);

        ford.setModel("Nissan");
        ford.setColor("Yellow");
        ford.setPrice(40000);

        ram.setModel("Kia");
        ram.setColor("White");
        ram.setPrice(30000);

        System.out.println("Model " + toyota.getModel() + " / " + "Color: " + toyota.getColor() + " / " + "Price " + toyota.getPrice());
        System.out.println("Model " + ford.getModel() + " / " + "Color: " + ford.getColor() + " / " + "Price " + ford.getPrice());
        System.out.println("Model " + ram.getModel() + " / " + "Color: " + ram.getColor() + " / " + "Price " + ram.getPrice());

        toyota.run();
        ford.feel();

    }

}


