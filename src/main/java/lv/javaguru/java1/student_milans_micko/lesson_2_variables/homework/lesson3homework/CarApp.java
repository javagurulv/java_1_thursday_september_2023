package lv.javaguru.java1.student_milans_micko.lesson_2_variables.homework.lesson3homework;

public class CarApp {

    public static void main(String[] args) {

        Car merc = new Car("Mercedes", "White",30000 );
        Car bmw = new Car("BMW", "Red", 35000);
        Car audi = new Car("Audi", "Black", 40000);

        System.out.println("Brand = " + merc.getCarBrand());
        System.out.println("Color = " + merc.getCarColor());
        System.out.println("Price = " + merc.getCarPrice());

        System.out.println("Brand = " + bmw.getCarBrand());
        System.out.println("Color = " + bmw.getCarColor());
        System.out.println("Price = " + bmw.getCarPrice());

        System.out.println("Brand = " + audi.getCarBrand());
        System.out.println("Color = " + audi.getCarColor());
        System.out.println("Price = " + audi.getCarPrice());

        merc.setCarBrand("Audi");
        merc.setCarColor("Yellow");
        merc.setCarPrice(50000);

        bmw.setCarBrand("Mercedes");
        bmw.setCarColor("Blue");
        bmw.setCarPrice(60000);

        audi.setCarBrand("BMW");
        audi.setCarColor("Purple");
        audi.setCarPrice(100000);

        System.out.println("Brand = " + merc.getCarBrand());
        System.out.println("Color = " + merc.getCarColor());
        System.out.println("Price = " + merc.getCarPrice());

        System.out.println("Brand = " + bmw.getCarBrand());
        System.out.println("Color = " + bmw.getCarColor());
        System.out.println("Price = " + bmw.getCarPrice());

        System.out.println("Brand = " + audi.getCarBrand());
        System.out.println("Color = " + audi.getCarColor());
        System.out.println("Price = " + audi.getCarPrice());
    }
}
