package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

class LaptopApplication {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", 999);
        Laptop laptop2 = new Laptop("IBM", 777);

        System.out.println("Model = " + laptop1.getModel());
        System.out.println("Model = " + laptop2.getModel());

        System.out.println("Price = " + laptop1.getPrice());
        System.out.println("Price = " + laptop2.getPrice());

    }

}
