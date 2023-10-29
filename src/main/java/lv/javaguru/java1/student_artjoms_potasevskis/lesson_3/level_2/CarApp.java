package lv.javaguru.java1.student_artjoms_potasevskis.lesson_3.level_2;

class CarApp {

    public static void main(String[] args) {

     Car audi = new Car("Audi","black", 35000);
     Car reno = new Car("Reno","blue",10000);
     Car opel = new Car("Opel","red",7500);

        System.out.println("Manufacturer = " + audi.getManufacturer());
        System.out.println("Color = " + audi.getColor());
        System.out.println("Price = " + audi.getPrice());

        System.out.println("Manufacturer = " + reno.getManufacturer());
        System.out.println("Color = " + reno.getColor());
        System.out.println("Price = " + reno.getPrice());

        System.out.println("Manufacturer = " + opel.getManufacturer());
        System.out.println("Color = " + opel.getColor());
        System.out.println("Price = " + opel.getPrice());

        audi.setManufacturer("Porsche");
        audi.setColor("purple");
        audi.setPrice(20000);

        reno.setManufacturer("Peugeot");
        reno.setColor("pink");
        reno.setPrice(12000);

        opel.setManufacturer("Honda");
        opel.setColor("White");
        opel.setPrice(17500);

        System.out.println("Manufacturer = " + audi.getManufacturer());
        System.out.println("Color = " + audi.getColor());
        System.out.println("Price = " + audi.getPrice());

        System.out.println("Manufacturer = " + reno.getManufacturer());
        System.out.println("Color = " + reno.getColor());
        System.out.println("Price = " + reno.getPrice());

        System.out.println("Manufacturer = " + opel.getManufacturer());
        System.out.println("Color = " + opel.getColor());
        System.out.println("Price = " + opel.getPrice());

    }
}
