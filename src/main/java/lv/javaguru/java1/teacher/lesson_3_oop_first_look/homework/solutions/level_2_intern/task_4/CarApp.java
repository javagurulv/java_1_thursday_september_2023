package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_2_intern.task_4;

class CarApp {

    public static void main(String[] args) {
        Car nissan = new Car("Nissan", "red", 40000);
        Car audi = new Car("Audi", "blue", 60000);
        Car porsche = new Car("Porsche", "black", 200000);

        System.out.println("Manufacturer = " + nissan.getManufacturer());
        System.out.println("Color = " + nissan.getColor());
        System.out.println("Price = " + nissan.getPrice());

        System.out.println("Manufacturer = " + audi.getManufacturer());
        System.out.println("Color = " + audi.getColor());
        System.out.println("Price = " + audi.getPrice());

        System.out.println("Manufacturer = " + porsche.getManufacturer());
        System.out.println("Color = " + porsche.getColor());
        System.out.println("Price = " + porsche.getPrice());

        nissan.setManufacturer("Ferrari");
        nissan.setColor("yellow");
        nissan.setPrice(500000);

        audi.setManufacturer("Porsche");
        audi.setColor("blue");
        audi.setPrice(300000);

        porsche.setManufacturer("Nissan");
        porsche.setColor("black");
        porsche.setPrice(30000);

        System.out.println("Manufacturer = " + nissan.getManufacturer());
        System.out.println("Color = " + nissan.getColor());
        System.out.println("Price = " + nissan.getPrice());

        System.out.println("Manufacturer = " + audi.getManufacturer());
        System.out.println("Color = " + audi.getColor());
        System.out.println("Price = " + audi.getPrice());

        System.out.println("Manufacturer = " + porsche.getManufacturer());
        System.out.println("Color = " + porsche.getColor());
        System.out.println("Price = " + porsche.getPrice());
    }

}
