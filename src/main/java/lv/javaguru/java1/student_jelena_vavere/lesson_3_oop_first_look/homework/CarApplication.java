package lv.javaguru.java1.student_jelena_vavere.lesson_3_oop_first_look.homework;

public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car("KIA", "RED", 5000);
        Car car2 = new Car("AUDI", "WHITE", 7000);
        Car car3 = new Car("PORSHE", "BLACK", 10000);

        System.out.println("Name = " + car1.getName());
        System.out.println("Name = " + car2.getName());
        System.out.println("Name = " + car3.getName());

        System.out.println("Colour = " + car1.getColor());
        System.out.println("Colour = " + car2.getColor());
        System.out.println("Colour = " + car3.getColor());

        System.out.println("Price = " + car1.getPrice());
        System.out.println("Price = " + car2.getPrice());
        System.out.println("Price = " + car3.getPrice());

            car1.setName("FORD");
            car2.setName("HONDA");
            car3.setName("MAZDA");

            car1.setColour("BLUE");
            car2.setColour("SILVER");
            car3.setColour("YELLOW");

            car1.setPrice(5000);
            car2.setPrice(4000);
            car3.setPrice(6000);

            System.out.println("Name = " + car1.getName() + ", Colour " + car1.getColor());
            System.out.println("Name = " + car2.getName() + ", Colour " + car2.getColor());
            System.out.println("Name = " + car3.getName() + ", Colour " + car3.getColor());

           // System.out.println("Colour = " + car1.getColor());
           // System.out.println("Colour = " + car2.getColor());
           // System.out.println("Colour = " + car3.getColor());

            System.out.println("Price = " + car1.getPrice());
            System.out.println("Price = " + car2.getPrice());
            System.out.println("Price = " + car3.getPrice());
        }
    }