package lv.javaguru.java1.student_artjoms_potasevskis.lesson_2.lessoncode;

class LaptopApplication {

    public static void main(String[] args) {

    Laptop laptop1 = new Laptop("Dell",1200);
    Laptop laptop2 = new Laptop("MAC",3158);


        System.out.println("Type = " + laptop1.getModel());
         System.out.println("Type = " + laptop2.getModel());


        System.out.println("Price = " + laptop1.getPrice());
        System.out.println("Price = " + laptop2.getPrice());
    }
}