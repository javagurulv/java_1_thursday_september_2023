package lv.javaguru.java1.student_danil_sitiakov.lesson_3;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Black", 10000);
        Car car2 = new Car("Lexus", "White", 20000);
        Car car3 = new Car("Volkswagen", "Silver", 30000);

        System.out.println("Car 1 = Brand is " +car1.getBrand() +
                "\n" + "Color is = " + car1.getColor() +
                "\n" + "Price is = " + car1.getPrice());
        System.out.println("Car 2 = Brand is " + car2.getBrand() +
                "\n" + " Color is = " + car2.getColor() +
                "\n" + "Price is = " + car2.getPrice());
        System.out.println("Car 3 = Brand is " + car3.getBrand() +
                "\n" + " Color is = " + car3.getColor() +
                "\n" + "Price is = " + car3.getPrice());


        car1.setBrand("Nissan");
        car1.setColor("Red");
        car1.setPrice(400000);

        car2.setBrand("BMW");
        car2.setColor("Blue");
        car2.setPrice(500000);

        car3.setBrand("Audi");
        car3.setColor("Yellow");
        car3.setPrice(600000);

        System.out.println("Car 1 = Brand is " +car1.getBrand() +
                "\n" + "Color is = " + car1.getColor() +
                "\n" + "Price is = " + car1.getPrice());
        System.out.println("Car 2 = Brand is " + car2.getBrand() +
                "\n" + " Color is = " + car2.getColor() +
                "\n" + "Price is = " + car2.getPrice());
        System.out.println("Car 3 = Brand is " + car3.getBrand() +
                "\n" + " Color is = " + car3.getColor() +
                "\n" + "Price is = " + car3.getPrice());

    }
}
